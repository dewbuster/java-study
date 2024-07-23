package days17;

import java.util.Date;

public class Ex08_05 {

	public static void main(String[] args) {
		// 설문조사
		// 시작일 24.6.25 9:00
		// 종료일 24.7.25 18:00

		Date day1 = new Date(2024-1900, 6-1, 20, 12, 0, 0);
		checkDate(day1);
		
		
		Date day2 = new Date(2024-1900, 7-1, 20, 12, 0, 0);
		checkDate(day2);

		//day2.after(start); boolean
		//day2.before(end);
		
		Date day3 = new Date(2024-1900, 7-1, 25, 19, 0, 0);
		checkDate(day3);

	}
	static Date start = new Date(2024-1900, 6-1, 25, 9, 0, 0);
	static Date end = new Date(2024-1900, 7-1, 25, 18, 0, 0);
	static long startMs = start.getTime();
	static long endMs = end.getTime();
	
	private static void checkDate(Date day) {
		long dayMs = day.getTime();
		if (dayMs >= startMs && dayMs <= endMs) System.out.println("설문 진행 중");
		else if (dayMs < startMs) System.out.println("설문시작 전 투표X");
		else if (dayMs > endMs) System.out.println("설문종료 후 투표X");
	}

}
