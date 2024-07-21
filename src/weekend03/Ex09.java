package weekend03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex09 {

	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		String[] s = IntStream.range(0, names.length)
				.filter(i -> (i % 5 == 0))
				.mapToObj(i -> names[i]).toArray(String[]::new);
		System.out.println(Arrays.toString(s));
	}

}
