package days18;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex03_07 {

	public static void main(String[] args) {
		
		// 1. 이번 달의 마지막 날짜 몇 일까지?
		//	  이번 달의 마지막 수요일?
		//	  이번 달의 첫 번째 금요일?
		// with(), plus(), minus() 날짜 수정 메서드 + 계산
		// 2. 자주 쓰일만한 날짜 계산들을 대신해주는 메서드
		//	를 구현해놓은 클래스: TemporalAdjusters
		/* 1.
		LocalDate d = LocalDate.now();
		System.out.println(d);
		d = d.withDayOfMonth(1);
		System.out.println(d);
		d = d.plusMonths(1);
		System.out.println(d);
		d = d.minusDays(1);
		System.out.println(d);
		int lastDay = d.getDayOfMonth();
		System.out.println(lastDay);
		*/
		
		/*
		LocalDate d = LocalDate.now();
		System.out.println(d.lengthOfMonth());
		*/
		
		// Temporal + Adjusters   메서드 정리..
		// 시간상의   조정자
		/*
		LocalDate d = LocalDate.now();
		System.out.println(d);
		// 다음 달의 첫 날
		System.out.println( d.with( TemporalAdjusters.firstDayOfNextMonth() ));
		// 이번 달의 첫 날  
		System.out.println( d.with( TemporalAdjusters.firstDayOfMonth() ));
		// 이번 달의 첫 번째 월요일
		System.out.println( d.with( TemporalAdjusters.firstInMonth(MONDAY) ));

		// 지난 주 월요일
		System.out.println( d.with( TemporalAdjusters.previous(MONDAY) ));
		System.out.println( d.with( TemporalAdjusters.previousOrSame(MONDAY) )); 
		*/
		
		LocalDate d = LocalDate.now();
		d = d.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(d);
	} // main

} // class
