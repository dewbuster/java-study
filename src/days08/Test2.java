package days08;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String strMoney;
		do {
			System.out.print("머니(money) 입력 ? ");
			strMoney = scanner.next();
		} while (!strMoney.matches("\\d+"));

		int money = Integer.parseInt(strMoney);
		int count = 0;
		int unit = 50000;
		boolean sw = false;

		while (unit >= 1) {
			count = money / unit;
			money = money % unit;
			System.out.printf("%,d\t %d개\t %,d\n", unit, count, money);

			unit /= sw? 2 : 5;
			sw = !sw;
		}

		scanner.close();

	}

}
