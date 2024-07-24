package days18;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Test2 {

	public static void main(String[] args) {
		
		int year = 2024;
		int month = 6;
		
		LocalDate d = LocalDate.of(year, month, 1);
		int dayOfWeek = d.get(ChronoField.DAY_OF_WEEK);
		
		LocalDate start = LocalDate.of(year, month, 1);
		start = start.minusDays(dayOfWeek % 7);
		
		System.out.println("=".repeat(50));
		for (int i = 1; i <= 42; i++) {
			int cmonth = start.getMonthValue();

			if (cmonth == month+1) System.out.printf("[%d]\t", start.getDayOfMonth());
			else if (cmonth == month-1) System.out.printf("(%d)\t", start.getDayOfMonth());
			else System.out.printf("%d\t", start.getDayOfMonth());

			if (i % 7 == 0) System.out.println();
			start = start.plusDays(1);
		}
		System.out.println("=".repeat(50));
		
		
		
	}

}
