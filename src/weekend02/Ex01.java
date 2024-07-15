package weekend02;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] m = { 2, 4, 6, 3, 9, 8, 7, 1, 5, 10};
		
		bubbleSort(m);
		int n = 7;
		int index = binarySearch(m, n);
		
		System.out.println(Arrays.toString(m));

		if (index == -1) {
			System.out.println("찾는 정수는 없다.");
		} else {
			System.out.printf("찾는 정수는 %d 인덱스 위치에 있다.\n", index);
		}
	}

	private static int binarySearch(int[] m, int n) {
		int bot = 0;
		int top = m.length-1;
		
		while(top >= bot) {
			int mid = (bot + top) / 2;
			if (m[mid] == n) return mid;
			else if (m[mid] > n) top = mid-1;
			else if (m[mid] < n) bot = mid+1;
		}
		return -1;
	}

	private static void bubbleSort(int[] m) {
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-1-i; j++) {
				//System.out.printf("%d-%d ", j, j+1);
				if(m[j] > m[j+1]) {
					System.out.print("changed");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				}
				//System.out.println(Arrays.toString(m));
			}
			//System.out.println("=".repeat(30));
		}
		
	}

}
