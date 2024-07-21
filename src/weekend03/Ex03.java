package weekend03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,3,3,3,3};
		
		System.out.println(solution(arr1, arr2));
		

	}
// 8ms
/*
	public static int solution(int[] arr1, int[] arr2) {
		long start = System.currentTimeMillis();
		try {
			int answer = Integer.compare(arr1.length, arr2.length);
			
			if(answer == 0) {
				answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
			}
			
			return answer;
			
		} finally {
			long finish = System.currentTimeMillis();
			long timeMs = finish - start;
			System.out.println(timeMs + "ms");
		}
		
	}
*/
	
	
//7ms
	public static int solution(int[] arr1, int[] arr2) {
		long start = System.currentTimeMillis();
		try {
			int answer = 0;
			if (arr1.length > arr2.length) {
				answer = 1;
			} else if (arr1.length < arr2.length) {
				answer = -1;
			} else {
				if (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) {
					answer = 1;
				} else if (Arrays.stream(arr1).sum() < Arrays.stream(arr2).sum()) {
					answer = -1;
				} else {
					answer = 0;
				}
			}
			return answer;
			
		} finally {
			long finish = System.currentTimeMillis();
			long timeMs = finish - start;
			System.out.println(timeMs + "ms");
		}
	}


}
