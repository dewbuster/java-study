package days07;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 4. 복습 풀이
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while ((nextTerm = firstTerm + secondTerm) <= 100) {
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		} // while
		
		System.out.printf("=%d\n", sum);
		// 3. 풀이
		/*
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		nextTerm = firstTerm + secondTerm;
		
		while (firstTerm + secondTerm <= 100) {
			sum += nextTerm;
			System.out.printf("%d+", nextTerm);
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			nextTerm = firstTerm + secondTerm;
		}
		
		System.out.printf("=%d\n", sum);
		*/
		/* 복습 . 2.풀이
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		
		while (true) {
			nextTerm = firstTerm + secondTerm;
			if (nextTerm > 100) break;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}			 
		
		System.out.printf("=%d\n", sum);
		*/
	}

}
