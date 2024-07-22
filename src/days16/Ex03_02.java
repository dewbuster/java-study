package days16;

public class Ex03_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		try {
			Person p2 = p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// ㅁ. equals
		//	   finalize()
		//	   nothfy() notifyAll(), wait()  스레드 관련

		
	} // main
	
} // class

class Person implements Cloneable {
	// 필드
	String rrn;
	String name;
	
	// 생성자
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return rrn.hashCode();
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + "]";
	}
	
	// p1.clone()
	// 부모의 clone() 메서드를 오버라이딩 했기 때문에
	// 리턴자료형이 Object라야 되지만
	// 리턴자료형을 복제하는 클래스 타입으로 변경할 수 있도록
	// jdk1.5 "공변변환타입" 새로운 문법이 추가...
	// 리턴자료형이 Object인 경우는 바꿀수 있음
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person pClone = (Person) super.clone();
		return pClone;
	}
	
	// p1.equals(p2)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.rrn.equals(p.rrn);
		}
		return false;
	}

}
