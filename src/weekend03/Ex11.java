package weekend03;

import java.util.Arrays;

public class Ex11 {

	public static void main(String[] args) {
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		
		int[] answer = new int[num_list.length];
		
		System.arraycopy(num_list, n, answer, 0, num_list.length-n);
		System.arraycopy(num_list, 0, answer, num_list.length-n, n);
		
		//int[] s = Arrays.stream(num_list).skip(n-1).toArray();
		
		System.out.println(Arrays.toString(answer));

	}

}
