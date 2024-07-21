package weekend03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08 {

	public static void main(String[] args) {
		String[] todo_list = { "readBook", "study", "haveLunch", "sleep" };
		boolean[] finished = { true, false, true, false};
		
		String[] answer = solution(todo_list, finished);
		System.out.println(Arrays.toString(answer));

	}
	
	public static String[] solution(String[] todo_list, boolean[] finished) {
        return IntStream.range(0, finished.length).filter(i -> !finished[i]).mapToObj(i -> todo_list[i])
                .toArray(String[]::new);
    }

}
