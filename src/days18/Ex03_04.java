package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author dewbuster
 * @date 2024. 7. 24.-오후 12:46:51
 * @subject
 * @content
 */
public class Ex03_04 {

	public static void main(String[] args) {
		
		// java.time 핵심클래스 불변
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		ld = ld.withYear(2020);
		System.out.println(ld);
		ld = ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld);
		
		ld = ld.withMonth(12);
		System.out.println(ld);
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 7);
		System.out.println(ld);
		
		ld = ld.withDayOfMonth(15);
		System.out.println(ld);
		
		ld = ld.minusYears(1);
		ld = ld.minusMonths(5);
		ld = ld.minusDays(3);
		System.out.println(ld);
		
		ld = ld.plusYears(1);
		ld = ld.plusMonths(5);
		ld = ld.plusDays(3);
		System.out.println(ld);
		
		// truncatedTo()  절삭하다, 끝을 잘라내다
		LocalTime lt = LocalTime.now();
		System.out.println(lt);   // 14:13:33.528119100
		// 시간 밑으로 절삭
		lt = lt.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(lt);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt); // 2024-07-24T14:16:18.676280600
		//날짜 밑으로 절삭
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);
	}

}
