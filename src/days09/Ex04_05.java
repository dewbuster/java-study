package days09;

public class Ex04_05 {
	public static void main(String[] args) {
		// 10 진수 정수 => 16진수 출력.
		int n = 125;     //  0x7D

		int remider, share;   

		// String strHex = "";
		StringBuilder sb = new StringBuilder();

		String hex = "0123456789ABCDEF";
		while ( n != 0 ) {   
			share = n / 16;
			remider = n % 16;
			// System.out.println(remider);
			sb.append(hex.charAt(remider));
			//sb.insert(0, hex)

			n = share;
		} // while

		System.out.println( sb.reverse()  );  



	} // main
}
