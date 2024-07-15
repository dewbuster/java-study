package days10;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int [] m = {1,2,3,4,5,6};
 		int [][] n = new int[2][3];

 		for (int i = 0; i < m.length; i++) {
			n[i / 3][i % 3] = m[i];
		}
 		System.out.println(Arrays.toString(n[0]));
 		System.out.println(Arrays.toString(n[1]));

	}

}
