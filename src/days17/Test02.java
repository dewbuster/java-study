package days17;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar finish = Calendar.getInstance();
		finish.set(2024, Calendar.DECEMBER, 14, 18, 0, 0);

		long diffMs = finish.getTimeInMillis() - now.getTimeInMillis();
		long dayLeft = diffMs/1000/60/60/24;
		System.out.printf("%d일 남음 ", dayLeft);
		
		/*
		Calendar now = Calendar.getInstance();
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		start.set(2024, Calendar.JULY, 20, 0, 0, 0);
		end.set(2024, Calendar.JULY, 24, 0, 0, 0);
		
		if (now.before(start)) System.out.println("설문기간 전 조사X");
		else if (now.after(end)) System.out.println("설문기간 지남 조사X");
		else System.out.println("설문조사 가능");
		*/

	}

}
