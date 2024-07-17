package days13;
/**
 * @author dewbuster
 * @date 2024. 7. 17.-오전 10:44:06
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * [ 멤버(필드, 메서드, 생성자) 앞의 접근지정자 ]
		 * 1. public - 패키지 내부, 외부 어디서나 참조가능
		 * 2. package(default) - 패키지 내부에서만 참조가능
		 * 3. private - 클래스 내부에서만 참조 가능
		 * 4. protected - package(default) + [상속]
		 * 										패키지 외부라도 상속관계가 있다면 참조 가능
		 * 접근 범위: public > protected > package > private
		 */
		
		// 지역변수는 접근지정자를 사용할 수 없다.
		// public int age = 20;  <- X
		
		// days13.Time.java
		
		// 패키지 외부 - Time	field 체크
		// days12.Ex12.java
		// 패키지 내부 - Time	field 체크
		Time t = new Time();
		t.hour = 9;
		t.minute = 10;
		t.second = 54;
		t.privateTest();
		

	}

}
