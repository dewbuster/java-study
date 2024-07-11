package days09;

public class Ex03_04 {

	public static void main(String[] args) {
		// [문제]
		// 거듭제곱 == 누승 == 멱 == pow
		// 2^3  == 밑수 (2)를 지수(3) 만큼 반복해서 곱하는 것.
		double result = pow(2, -3);
		//double result2 = recursivePow(2, 3);
		System.out.println(result);
		//System.out.println(result2);
		
	}

	private static double pow(int i, int j) {
		double result = 1;
		int exp = j < 0 ? -j : j;
		for (int k = 0; k < exp; k++) {
			result *= i;
		}
		return j>0 ? result: 1/result;
	}
	/*
	private static double recursivePow(int i, int j) {
		int exp = j < 0 ? -j : j;
		if (exp == 1) return i;
			return i * recursivePow(i, exp-1);
	}
	*/
	
}
