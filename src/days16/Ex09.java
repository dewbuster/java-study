package days16;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 3, 3, 2, 1};
		int n = arr.length;
		solution(arr, n);
	}

	private static void solution(int[] arr, int n) {
		System.out.println(n);
		while(true) {
			int min = Arrays.stream(arr).min().getAsInt();
			int[] cArr = Arrays.stream(arr)
					.filter(i -> i - min != 0)
					.map(i -> i - min).toArray();
			if (cArr.length < 1) 
				break;
			System.out.println(cArr.length);
			arr = cArr;
		}
	}
}
