package days17;

import java.util.Calendar;

public class Ex09 {

	public static void main(String[] args) {
		// jdk 1.1  java.util.Calendar 클래스
		Calendar c = Calendar.getInstance();
		// 년
		System.out.println(Calendar.YEAR);
		System.out.println(c.get(1));
		System.out.println(c.get(Calendar.YEAR));
		// 월
		System.out.println(c.get(Calendar.MONTH) + 1);
		// 일
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// 시간
		System.out.println(c.get(Calendar.HOUR));			// 12시간
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); 	// 24시간
		// 분
		System.out.println(c.get(Calendar.MINUTE));
		// 초
		System.out.println(c.get(Calendar.SECOND));
		// 밀리초
		System.out.println(c.get(Calendar.MILLISECOND));
		// 요일
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		// Date 	0(일), 1(월), 2(화)...6(토)
		// Calender 1(일), 2(월), 3(화)...7(토)

		System.out.println(c.get(Calendar.AM));
		System.out.println(c.get(Calendar.AM_PM));
		// 마지막 날짜
		
	} // main

} // class
