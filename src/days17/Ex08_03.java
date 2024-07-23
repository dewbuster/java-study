package days17;

import java.util.Date;

public class Ex08_03 {

	public static void main(String[] args) {
		
		int year = 2024;
		int month = 6;
		int date = 1;
		
		int dayOfWeek = getDayOfWeek(year, month, date);  // 1(월)
		int lastDay = getLastDay(year, month);
		
		Date start = new Date(year-1900, month-1, 1);
		start.setDate(start.getDate() - dayOfWeek);
		//System.out.println(start.toLocaleString());
		
		System.out.println("=".repeat(30));
		System.out.println("=".repeat(30));
		for (int i = 1; i <= 42; i++) {
			//System.out.println(start.toLocaleString());
			int cmonth = start.getMonth()+1;
			
			if (cmonth == month+1) System.out.printf("[%d]\t", start.getDate());
			else if (cmonth == month-1) System.out.printf("(%d)\t", start.getDate());
			else System.out.printf("%d\t", start.getDate());
			
			if (i % 7 == 0) System.out.println();
			start.setDate(start.getDate() + 1);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		// 24.6.30(시작날짜) ~ 42일
	} // main

	private static int getLastDay(int year, int month) {
		Date d = new Date(year-1900, month-1, 1);
		d.setMonth(d.getMonth() + 1);
		d.setDate(d.getDate() -1);
		return d.getDate();
	}

	private static int getDayOfWeek(int year, int month, int date) {
		Date d = new Date(year-1900, month-1, date);
		return d.getDay();
	}

} // class
