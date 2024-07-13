package weekend02;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] m  =  {1,2,3};
		int[] temp = new int[4];
		System.arraycopy(m, 0, temp, 0, m.length);
		m = temp;
		m[3] = 4;
		System.out.println(Arrays.toString(m));
	}

}
