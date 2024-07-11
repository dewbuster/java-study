package days09;

public class Ex04_03 {

	public static void main(String[] args) {
		// 10진수 -> 16정수 출력
		// 125       0x7D
		int n = 125;
		int share, reminder;
		String hex = "";
		
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			switch (reminder) {
			case 10:
				hex = 'A' + hex;
				break;
			case 11:
				hex = 'B' + hex;
				break;
			case 12:
				hex = 'C' + hex;
				break;
			case 13:
				hex = 'D' + hex;
				break;
			case 14:
				hex = 'E' + hex;
				break;
			case 15:
				hex = 'F' + hex;
				break;
			default:
				hex = reminder + hex;
				break;
			} // switch
			n = share;
		} // while
		hex = "0x" + hex;
		System.out.println(hex);
	} // main
} // class
