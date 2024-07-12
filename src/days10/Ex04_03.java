package days10;

import java.util.Arrays;

public class Ex04_03 {

	public static void main(String[] args) {
		//배열 복사
		int[] m = {3, 5, 2, 4, 1};
		System.out.println(Arrays.toString(m));	
		int[] temp = new int[m.length+5];
		
		System.arraycopy(m, 0, temp, 0, 5);
		System.out.println(Arrays.toString(temp));

	}

}
