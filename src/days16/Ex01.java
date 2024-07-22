package days16;
/**
 * @author dewbuster
 * @date 2024. 7. 22.-오전 9:17:10
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("dd");
		/*
		 * [ 예외 처리 (Exception Handling) ]
		 * 1. 프로그램 오류(에러)
		 * 		- 프로그램 오작동 또는 비정상 종료되는 원인
		 * 2. 오류 발생 시점에 따라
		 * 		1) 컴파일 오류
		 * 			javac.exe Hello.java
		 * 		2) 런타임(실행) 오류
		 * 			java.exe Hello
		 * 			ㄱ. 에러(Error) - 메모리 부족, 스택 오버플로우
		 * 					복구할 수 없는 심각한 오류
		 * 					Error 클래스
		 * 			ㄴ. 예외(Exception) - 개발자가 수습할 수 있는 덜 심각한 실행오류
		 * 					Exception 부모클래스
		 *						ㄴ 자식 클래스
		 * 3. 예외 클래스 상속 계층도
		 * 				Object
		 * 
		 *	 			Throwable 인터페이스
		 * 
		 * 		Exception		Error
		 *		  			 	 ㄴ OutOfMemoryError  
		 * 		  ㄴ RuntimeException 실행 예외
		 * 			- 개발자의 실수로 발생하는 예외
		 * 				NullPointException
		 * 				ClassCastException
		 * 				IndexOutofBoundException
		 * 		  ㄴ 제외한 Exception 자손클래스
		 * 
		 * 4. 프로그램 실행 시 발생할 수 있는 예기치 못한 예외에 대비한 코드를 작성하는것 -예외처리
		 * 		-프로그램의 비정상적인 종료를 막고, 정상 상태 유지.
		 * 		-프로그램이 실행할 때 만약에 예외(Exception)이 발생하면 
		 * 		 JVM의 "예외처리기(UncaughExceptionHandler)"가 예외를 받아서 예외의 원인을 출력함.
		 * 
		 * 5. 예외 처리
		 * 	1) try - catch 문
		 * 	2) throws 문
		 */
		
	}

}
