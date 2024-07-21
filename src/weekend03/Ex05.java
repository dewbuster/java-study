package weekend03;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		
		String my_string = " i    love   you";
		
		String[] arr = my_string.trim().split("\\s+");
		
		String[] arr2 = Arrays.stream(my_string.trim().split(" "))
				.filter(x -> !x.equals("")).toArray(String[]::new);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	

}
