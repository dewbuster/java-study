package days17;

import java.util.Calendar;

public class Ex09_02 {

	public static void main(String[] args) {
		// 개강일로부터 오늘(현재)까지 d h m s ms ... 출력
		Calendar now = Calendar.getInstance();
		
		Calendar first = Calendar.getInstance();
		first.set(2024, 7-1, 1, 9, 0, 0);
		
		long nowMs = now.getTimeInMillis();
		long startMs = first.getTimeInMillis();
		long pastTime = nowMs-startMs;
		long count = 0;
		long reminder = 0;
		
		int[] unit = {1000*60*60*24, 1000*60*60, 1000*60, 1000};
		String[] times = {"일", "시", "분", "초"};
		for (int i = 0; i < unit.length; i++) {
			count = pastTime / unit[i];
			reminder = pastTime % unit[i];
			System.out.printf("%d %s ", count, times[i]);
			pastTime = reminder;
		}
		
	}
}
