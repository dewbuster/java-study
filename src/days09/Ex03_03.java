package days09;

public class Ex03_03 {

	public static void main(String[] args) {
		// 재귀함수
		// 트리구조 처리 작업 할 때
		// [팩토리얼 factorial]  계승
		// 정의) 1에서 양의 정수의 곱
		// n! = n*(n-1)*(n-2)*.....*1
		// 0! = 1 (약속)
		int n = 5;
		//int result = factorial(n);
		int result = recursiveFactorial(n);
		System.out.println("=" + result);
		
	} // main

	private static int recursiveFactorial(int n) {
		if (n == 1)	return n;
		return n * recursiveFactorial(n-1);
	}

	/*
	private static int factorial(int n) {
		int result = 1;
		for (int i = n; i >= 1 ; i--) {
			System.out.printf("%d*", i);
			result *= i;
		}
		return result;
	}
	*/

}  // class
