package days10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = "[1-9]+";
		String strNumber;
		do {
			System.out.print("로또 게임 횟수 입력 (n) ? ");
			strNumber = scanner.next();
			
		} while (!strNumber.matches(regex));
		
		int n = Integer.parseInt(strNumber);
		int[][] lotto = new int[n][6];
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d 게임]: ", i+1);
			lotto[i] = new Random().ints(1, 46).distinct().limit(6).toArray();
			System.out.println(Arrays.toString(lotto[i]));
		}
		
		scanner.close();
	}

}
