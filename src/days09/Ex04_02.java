package days09;

public class Ex04_02 {

	public static void main(String[] args) {
		int n = 10;    // 8진수
		int share;
		int reminder;
		String str = "";
		while (n != 0) {
			share = n / 8;
			reminder = n % 8;
			str = reminder + str;
			n = share;
		}
		System.out.println("0" + str);
	}

}
