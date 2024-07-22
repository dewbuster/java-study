package days16;

import java.io.IOException;

/**
 * @author dewbuster
 * @date 2024. 7. 22.-오전 10:45:21
 * @subject [예외 고의로 개발자가 발생시키기]
 * @content throw문 사용
 */
public class Ex01_06 {

	public static void main(String[] args) {
		// 컴파일러가 컴파일할 때
		// 	ㄴ예외 체크 O checked 예외
		// 	ㄴ예외 체크 X unchecked 예외 - unchecked (extends RuntimeException)
		
		// throw new ArithmeticException(); - unchecked (extends RuntimeException)
		// throw new IOException();
				
	}

}
