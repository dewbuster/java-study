package weekend03;

import java.util.*;
import java.util.stream.Collectors;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] arr = {5, 1, 4};
		int[] xArr = solution(arr);
		List<Integer> xArr2 = solution2(arr);
		
		System.out.println(Arrays.toString(xArr));
		System.out.println(xArr2);

	}
	
	public static int[] solution(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count += arr[i];
		}
        int[] answer = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[index++] = arr[i];
			}
		}
        return answer;
    }
	
	public static List<Integer> solution2(int[] arr) {
        return Arrays.stream(arr).boxed().flatMap(num -> Collections.nCopies(num, num).stream()).collect(Collectors.toList());
    }
	

}
