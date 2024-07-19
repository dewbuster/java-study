package days15;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [final 키워드 정리]
		 */
		// final + 변수 앞에   ==  상수
		final double PI = 3.141592;
		FinalTest ft = new FinalTest();
		ft.test(10);		
	} // main

}  //class

class P{
	
	// 필드
	final int MAX_VALUE = 1; // 명시적 초기화
	final int MIN_VALUE;
		
	P(int minValue){  // 생성자 초기화
		MIN_VALUE = minValue;
	}
	
	final int disp() {
		return 0;
	}
}
class C extends P{
	/* final 메서드는 자식클래스에서 재정의 할 수 없다.
	@Override
	int disp() {
		return 100;
	}
	*/
	C(int value){
		super(value);
	}
	
}

// 1. final + class 선언 : 최종 클래스 - 상속할 수 없음
final class FinalTest{
	//			매개변수 
	void test( final int n ) {
		// n = 100; 수정 불가
	}
}