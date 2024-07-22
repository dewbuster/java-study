package days16;

import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
/*
		Scanner scanner = new Scanner(System.in);
		try {
			//
			//
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			scanner.close();
		}
*/
		// try ~ resource 문
		try (Scanner scanner = new Scanner(System.in)){
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // main

} // class
