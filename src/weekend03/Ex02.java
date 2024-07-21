package weekend03;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		System.out.println(Arrays.toString(solution(num_list)));
	}
	
	/*
	public static int[] solution(int[] num_list) {
		int[] a = IntStream.of(num_list).sorted().limit(5).toArray();
        return a;
    }
	*/
	
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		
		return Arrays.copyOfRange(num_list, 0, 5);
	}

	
	

}
