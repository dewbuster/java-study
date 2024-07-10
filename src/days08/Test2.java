package days08;

public class Test2 {

	public static void main(String[] args) {
		
		int money = 125760;
		int count = 0;
		int unit = 50000;
		boolean sw = false;

		while (unit >= 1) {
			count = money / unit;
			money = money % unit;
			System.out.printf("%,d, %d, %,d\n", unit, count, money);
	
			unit /= sw? 2 : 5;
			sw = !sw;
		}

	}

}
