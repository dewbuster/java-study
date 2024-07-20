package weekend03;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {
		
		String numStr = "123456";
		int[] a = Stream.of(numStr.split("")).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(a));

		//1등
		//numStr.chars().map(c -> c - 48).sum()
		//2등
		//Stream.of(numStr.split("")).mapToInt(Integer::parseInt).sum()

	}

}
