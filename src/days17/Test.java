package days17;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("> 년도 입력 ? ");
			int year = scanner.nextInt();
			
			for (int i = 1; i <= 12; i++) {
				System.out.printf("%d월: %d일\n", i, getLastDay(year, i));
			}
		} catch (Exception e) {
		}

	}
	private static int getLastDay(int year, int month) {
		/*
		Date d = new Date(year-1900, month-1, 1);
		d.setMonth(d.getMonth() + 1);
		d.setDate(d.getDate() - 1);
		return d.getDate();
		*/
		Calendar c = new GregorianCalendar(year, month-1, 1);
		return c.getActualMaximum(Calendar.DATE);
		
	}
}
