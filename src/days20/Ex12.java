package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.stream(array).boxed().collect(Collectors.toList()));
		
		while(true) {
			List<Integer> cArr = list.stream().distinct().collect(Collectors.toList());

			for (int i : cArr) {
				list.remove(list.indexOf(i));
			}
			
			if (list.size() == 0) {
				if (cArr.size() != 1) return -1;
				else return cArr.get(0);
			}
		}
    }
}
