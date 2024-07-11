package days09;

public class Ex03_02 {

	public static void main(String[] args) {
		int n = 10;
		int result = recursiveHap(n);
		System.out.println(result);
	}

	private static int recursiveHap(int n) {
		if (n == 1) return 1;
		return n + recursiveHap(n-1);
	}

}
