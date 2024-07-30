package days22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [직렬화/역직렬화]
		 * 1. 부모가 Serializable 인터페이스를 구현한 클래스라면 
		 * 		자식은 Serializable 인터페이스를 구현하지 않아도 직렬화 가능
		 * 2. 자식만 Serializable 인터페이스를 구현했다면 직렬화 할때 부모의 멤버는 제외된다.
		 */
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		
		String name = ".\\src\\days22\\child.ser";
		try( FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(c);
			oos.flush();
			System.out.println("> c 객체를 직렬화 시켜서 oos 파일로 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
class Parent {
	String name;
}

class Child extends Parent implements Serializable {
	int age;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name); // 개발자 직접  추가 | 멤버 하나하나 추가 해줘야함
		out.defaultWriteObject(); // age
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF(); // 개발자 직접  추가 | 멤버 하나하나 추가 해줘야함
		in.defaultReadObject();  // age
	}
}

/*
class Parent implements Serializable{
	String name;
}

class Child extends Parent {
	int age;
}
*/