package weekend03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {4, 2, 6, 1, 7, 6};
		int n = 2;

		//int[] s =IntStream.range(0, num_list.length).filter(i -> i % n == 0).map(i -> num_list[i]).toArray();
		
		// iterate 첫번째-초기값, 두번째-종료조건, 세번째-값이 어떻게 변경될지
		int[] s = IntStream.iterate(0, i -> i < num_list.length, i -> i + n)
				.map(i -> num_list[i]).toArray();
		
		System.out.println(Arrays.toString(s));
	}

}
