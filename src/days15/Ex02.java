package days15;

public class Ex02 {

	public static void main(String[] args) {
		
		// 추상(abstract) 메서드
		//	ㄴ 몸체(body)가 없는 메서드
		// 추상(abstract) 클래스
		//	ㄴ 공통적인 멤버를 가진 클래스 설계..
		//	ㄴ 객체를 생성할 수 없다.
		// 		new Parent(); X
		
		Parent p = new Child();
		p.dispA();
		
	}
}

abstract class Parent{
	// 필드
	// 생성자
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
}
class Child extends Parent{

	@Override
	void dispA() {
	}

	@Override
	void dispB() {
	}

	@Override
	void dispC() {
	}
	
}
