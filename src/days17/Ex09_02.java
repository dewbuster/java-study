package days17;

import java.util.Calendar;

public class Ex09_02 {

	public static void main(String[] args) {
		// 개강일로부터 오늘(현재)까지 d h m s ms ... 출력
		Calendar now = Calendar.getInstance();
		long nowMs = now.getTimeInMillis();
		System.out.println(nowMs);
		Calendar start = Calendar.getInstance();
		start.set(2024, 7, 1, 9, 0, 0);
		long startMs = start.getTimeInMillis();
		System.out.println(startMs);

	}

}
