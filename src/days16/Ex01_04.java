package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_04 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		// 다중 catch문 -> JDK 1.7 | 기호 (연산자X) 멀티 catch문
		try {
			System.out.println("> a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			double c = a / b ;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			scanner.nextLine();
			e.printStackTrace();
		} finally {
			// DB close // file close
		}
		
		System.out.println("end");

	} // main

} // class
