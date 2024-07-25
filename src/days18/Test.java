package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		/* 1.
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy.MM.dd (E) hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String s = sdf.format(c.getTime());
		System.out.println(s); // c.getTime으로 Calendar -> Date로 변환해 입력
		*/

		// DecimalFormat
		int money = 3276500;
		
		/* 2
		//String pattern = "#,###.00";
		//String pattern = "#,###.##";
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String smoney = df.format(money);
		System.out.println(smoney);
		*/
		
		/*
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String sd = dtf.format(d);
		System.out.println(sd);
		*/
		String sd = "2024년 07월 24일";
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d2 = LocalDate.parse(sd, dtf);
		System.out.println(d2);

		// 예) 수료일 - 오늘 날짜 = 날짜 간격?

		LocalDate ed = LocalDate.of(2024, 12, 14);
		ed = ed.plusDays(1);
		LocalDate td = LocalDate.now();

		Period p = Period.between(td, ed);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());

		// 23:00:00 퇴근
		LocalTime et = LocalTime.of(23, 0);
		LocalTime tt = LocalTime.now();

		Duration d = Duration.between(tt, et);
		System.out.println(d.getSeconds());
		System.out.println(d.toMinutes());
		System.out.println(d.toHours());


	}

}
