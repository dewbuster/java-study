package days12;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * [JVM의 메모리 구조]
		 * 자바 응용 프로그램 -> 실행 -> JVM 가상머신에서 실행
		 * 					  -> 사용할 메모리 할당
		 * 		1) Call Stack(스택영역)
		 * 			-> 지역변수, 매개변수
		 * 		2) Heap (동적영역)
		 * 			new int[3]
		 * 			new Student();
		 * 		3) Method Area (메서드 영역)
		 * 			processRank() 메서드 등록
		 * 			클래스(static) 변수 저장
		 * 			클래스 파일( .class)에 대한 정보 저장
		 * 			클래스, 인터페이스 정보 저장 영역
		 */
		
		/*
		 * [3가지 종류의 변수]
		 * 1. 선언 위치에 따른 종류
		 * 		ㄱ. 지역변수
		 * 		ㄴ. 멤버변수 (클래스 안에 선언되는 변수) == 필드
		 * 			1) 인스턴스 변수
		 * 			2) 클래스 변수
		 * 
		 * 
		 */

	}

}
