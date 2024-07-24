package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author dewbuster
 * @date 2024. 7. 24.-오후 12:13:13
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);   // 2024-07-24
		LocalDate ld2 = LocalDate.of(2024, 7, 24);
		System.out.println(ld2);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt); // 12:16:42.723257500
		LocalTime lt2 = LocalTime.of(12, 15, 32);
		System.out.println(lt2);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);  // 2024-07-24T12:18:10.262462400
		LocalDateTime ldt2 = LocalDateTime.of(ld2, lt2);
		System.out.println(ldt2);
		
		
	} // main

} // class
