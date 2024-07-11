package days09;

public class Test {

	public static void main(String[] args) {
		
		int n = 125;
		int share, reminder;
		int[] binaryArr = new int[16];

		int index = binaryArr.length - 1;
		
		while (n != 0) {
			
			share = n / 2;
			reminder = n % 2;
			binaryArr[index--] = reminder;
			
			n = share;
		}
		
		for (int i = 0; i < binaryArr.length; i++) {
			System.out.printf("%d", binaryArr[i]);
			if ( i % 8 == 7) System.out.print(" ");
		}
	} // main
/*
	public static int recursiveHap(int n) {
		if (n == 1) return 1;
		return n + recursiveHap(n-1);
	}
*/
	
} // class
