package days17;

import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 * 1. 날짜+시간 클래스, 형식화 클래스
		 * 		jdk 1.0 java.util.Date
		 * 		jdk 1.1 java.util.Calendar
		 * 							ㄴ GregorianCalendar
		 * 		jdk 1.8 java.time 패키지 + 하위 패키지
		 * 				다양한 날짜/시간 클래스 추가
		 * 
		 * 2. 컬렉션 프레임워크
		 * 3. 자바 IO(입출력)
		 * 4. 열거형, 제네릭
		 * 5. 람다와 스트림
		 */
		
		Date d = new Date();
		
		Date d2 = new Date(d.getTime());
		System.out.println(d2.toLocaleString());
		
		// 1900.1.1 00:00:00 ~   ms   long형 반환
		// long ms = d.getTime();
		
		// 년,월,일,시간,분,초
		System.out.println(d.getYear() + 1900);
		System.out.println(d.getMonth() +1);
		System.out.println(d.getDate());
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDay()); // 0 일 1 월 2 화 ---6토
		
		System.out.println(d.toString());
		System.out.println(d);
		System.out.println(d.toLocaleString());
		System.out.println(d.toGMTString());
	}

}
