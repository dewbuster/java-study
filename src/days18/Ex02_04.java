package days18;

import java.text.MessageFormat;

public class Ex02_04 {

	public static void main(String[] args) {
		// [MessageFormat 형식화 클래스]
		// 데이터 -> 특정형식으로 출력
		String name = "권맑음";
		int age = 26;
		boolean gender = true;
		double height = 178.67;
		char grade = 'A';
		// 이름:권맑음, 나이:26살, 성별:남자, 키:178.67, 등급:A 입니다.
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
		String s =  MessageFormat.format(pattern,  name, age, gender?"남자":"여자", height, grade );

	}

}
