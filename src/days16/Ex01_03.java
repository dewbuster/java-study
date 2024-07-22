package days16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_03 {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner scanner = new Scanner(System.in);

		// 다중 catch문
		try {
			System.out.println("> a, b 두 정수 입력 ? ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			double c = a / b ;
			System.out.printf("%d / %d = %.2f\n", a, b, c);
		} catch (InputMismatchException e) {
			// TODO: handle exception
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (Exception e) {
			scanner.nextLine();
			e.printStackTrace();
		}
		
		System.out.println("end");

	} // main

} // class
