package weekend04;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] emergency = {1, 2, 3, 4, 5, 6, 7};
		int[] answer = new int[emergency.length];
		Arrays.fill(answer, 1);
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (emergency[i] < emergency[j]) answer[i]++;
			}
		}		
		System.out.println(Arrays.toString(answer));
		
	}

}
