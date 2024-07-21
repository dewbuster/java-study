package weekend03;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 7, 15, 50, 55, 70};
		
		arr = Arrays.stream(arr)
		.map(i -> (i>=50&&i%2==0) ? i/2 : (i<50&&i%2!=0) ? i*2 : i)
		.toArray();
		
		System.out.println(Arrays.toString(arr));

	}

}
