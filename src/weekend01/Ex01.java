package weekend01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자(ch) 입력 ? ");
		char ch = scanner.next().charAt(0);
		
		if ( 'A' <= ch && ch <= 'Z' ) {
			System.out.println("대문자입니다.");
		} else if ( 'a' <= ch && ch <= 'z' ) {
			System.out.println("소문자입니다.");
		} else if ( '0' <= ch && ch <= '9' ) {
			System.out.println("숫자입니다.");
		} else if ( ('#' <= ch && ch <= '&') || ch == '!' || ch == '@' ) {
			System.out.println("특수문자입니다.");
		}
		
		scanner.close();
		
	}

}
