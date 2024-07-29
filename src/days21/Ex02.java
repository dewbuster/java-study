package days21;

import java.util.Scanner;

//import lombok.Getter;

//@Getter // 컴파일러가 getter 메서드 자동 추가
public class Ex02 {
	
	// @Override
	// 컴파일러에게 오버라이딩 한 메서드를 알려줌

	public static void main(String[] args) {
		/*
		 * [어노테이션(Annotation)]
		 * 1. 사전적 의미 : 주석
		 * 2. 정의 : 프로그램의 소스 코드 안에 다른 프로그램을 위해서
		 * 			 미리 약속된 형식을 포함시키는 것.
		 * 3. jdk에서 기본적으로 제공하는 어노테이션: 표준 어노테이션
		 * 4. 표준 어노테이션 종류
		 * 	1) @Override
		 * 	2) @Deprecated - 생성자, 필드, 메서드가 앞으로 없어질 예정이다.
		 * 	3) @SuppressWarnings - 컴파일러의 특정 경고 메시지가 나타나지 않게 함.
		 * 	4) @FunctionInterface - 함수형 인터페이스
		 * 	5) @SafeVarargs - 제네릭 타입의 가변인자에 사용되는 어노테이션
		 * 	6) @Native - c언어 메서드 -> 자바에서 사용할때
		 * 
		 * 또 다른 어노테이션에 사용되는 어노테이션 : 메타 어노테이션
		 * @Target, @Documented, @Inherited, @Retention, @repeatable
		 * 
		 */
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);
		
	} // main

} // class
