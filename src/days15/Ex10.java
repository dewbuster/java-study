package days15;

public class Ex10 {

	public static void main(String[] args) {
		
		// 인터페이스 : 상수, 추상메서드만 + [static, defualt 메서드]
	    // 1) 디폴트 메서드와 클래스의 메서드가 충돌나면
	    ///    ==> 디폴트 메서드는 무시가 된다. 
	    // 2) 여러 인터페이스를 구현하면 
	    //  디폴트 메서드와 충돌나면 
	    //    ==> 충돌나는 디폴트 메서드를 오버라이딩하면 해결.
		
	} // main

} // class

interface Ia{
	// 3개의 추상 메서드 선언
}

interface Ib{
	// 1개의 추상 메서드 선언
}

//인터페이스 끼리의 다중 상속 extends
interface Ic extends Ia, Ib{
	// 3개의 추상 메서드 선언 (Ia 상속)
	// 1개의 추상 메서드 선언 (Ib 상속)
	
	// 1개의 추상 메서드 선언
}

class A1 implements Ia{
	// [오버라이딩]
	// 3개의 추상 메서드 선언.(Ia)
}
class A2 implements Ib{
	// [오버라이딩]
	// 1개의 추상 메서드 선언.(Ib)
}
class A3 implements Ic{
	// [오버라이딩]
	// 3개의 추상 메서드 선언.(Ia)
	// 1개의 추상 메서드 선언.(Ib)
	
	// 1개의 추상 메서드 선언                                           
}
