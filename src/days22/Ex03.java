package days22;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author dewbuster
 * @date 2024. 7. 30.-오후 12:23:34
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [직렬화(Serialization)]
		//	ㄴ 객체를 -> 스트림으로 만든 것
		//			데이터 송/수신
		// [역직렬화(descrialization)]
		// 스트림을 -> 객체로
		
		// 객체를 직렬화/역직렬화 할 수 있는 바이트 스트림
		// ObjectInputStream
		// ObjectOutputStream
		
		// 사람(사용자) 정보를 송/수신
		// 이름,주소,나이 등등 정보
		// String info = "홍길동/서울/23/등등";
		
		User u1 = new User("이시훈", "1234", 25);
		User u2 = new User("원충희", "4321", 29);
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		
		// u1, u2, list 객체를 직렬화 -> 파일 쓰기(저장)
		String name = ".\\src\\days22\\user.ser";
		try( FileOutputStream fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			System.out.println("> u1,u2,list 객체를 직렬화 시켜서 oos 파일로 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
