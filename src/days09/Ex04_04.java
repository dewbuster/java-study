package days09;

public class Ex04_04 {

	public static void main(String[] args) {
		// 10진수 -> 16정수 출력
		// 125       0x7D
		int n = 125;
		int share, reminder;
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','A', 'B', 'C', 'D', 'E', 'F'};
		String hex = "";
		while (n != 0) {
			share = n / 16;
			reminder = n % 16;
			hex = ch[reminder] + hex;
			n = share;
		} // while
		hex = "0x" + hex;
		System.out.println(hex);
	} // main
} // class
