package days16;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("> a, b 두 정수 입력 ? ");
				a = scanner.nextInt();
				b = scanner.nextInt();
				break;
			} catch (Exception e) {
				scanner.nextLine();
				System.out.println("> 입력값 잘못 입력");
				System.out.println(e.toString());
			}
		}
		
		try {
			double c = a / b ;			
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (ArithmeticException e) { // 자식 catch 블럭을 먼저 코딩
			System.out.println(e.toString());
		} catch (Exception e) {
			//
		}
		
		System.out.println("end");

	} // main

} // class
