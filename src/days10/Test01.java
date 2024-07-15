package days10;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int [] m = {1,2,3};
		int[] temp = new int[m.length+1];
		int index = 1;
		System.arraycopy(m, 0, temp, 0, index);
		temp[index] = 4;
		System.arraycopy(m, 1, temp, index+1, m.length-1);
		m = temp;
		System.out.println(Arrays.toString(m));

	}

}
