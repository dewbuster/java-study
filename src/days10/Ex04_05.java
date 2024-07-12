package days10;

import java.util.Arrays;

public class Ex04_05 {

	public static void main(String[] args) {
		// 정렬(Sort)
		// 오름차순 정렬([asc]ending) 12345 a~z ㄱ~ㅎ
		// 내림차순 정렬 ([desc]ending)54321 z~a ㅎ~ㄱ
		// [버블정렬]
		// 선택정렬
		// 삽입정렬
		// 병합정렬
		int[] m = {3, 5, 2, 4, 1, 6, 2, 4, 2, 3, 4, 6, 1};
		System.out.println(Arrays.toString(m));
//		Arrays.sort(m);
		bubbleSort(m);
		//selectionSort(m);
		System.out.println(Arrays.toString(m));
		
		
	}
/*
	private static void selectionSort(int[] m) {
		for (int i = 0; i < 4; i++) {
			for (int j = i+1; j <= 4; j++) {
				System.out.printf("%d-%d", i, j);
				if (m[i] > m[j]) {
					System.out.print("change");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}
	}
*/
	// 오름차순 정렬(asc) 12345
	private static void bubbleSort(int[] m) {
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-1-i; j++) {
				System.out.printf("%d-%d", j, j+1);
				if (m[j] > m[j+1]) {
					System.out.print("change");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				System.out.println(Arrays.toString(m));
			}
			System.out.println();
		}
		
	}

}
