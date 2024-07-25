package days18;

import java.time.LocalDateTime;

public class Test4 {

	public static void main(String[] args) {
		/*
		1) 설문 시작일 : 23.8.10   9:00:00
	   2) 설문 종료일 : 23.8.15  18:00:00
	   */
		
		LocalDateTime start = LocalDateTime.of(2023, 8, 10, 9, 0, 0);
		LocalDateTime end = LocalDateTime.of(2023, 8, 15, 18, 0, 0);
		LocalDateTime now = LocalDateTime.now();
		
		if (now.isBefore(start)) System.out.println("설문 시작전 조사X");
		else if (now.isAfter(end)) System.out.println("설문 끝남 조사X");
		else System.out.println("설문 가능");
		
		
		
	}

}
