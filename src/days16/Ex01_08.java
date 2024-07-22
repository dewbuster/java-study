package days16;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 22.-오전 10:45:21
 * @subject [예외 고의로 개발자가 발생시키기]
 * @content throw문 사용
 * 			throws 와 다름
 * 			예) 국어 점수를 입력받아서 반환하는 getScore()
 * 			메서드 선언
 * 			 ㄴ 국어점수 0~100 아니라면 강제로 예외 발생
 */
public class Ex01_08 {

	public static void main(String[] args) {
		
		int kor = 0;
		try {
			kor = getScore("국어");
			System.out.println(kor);
		} catch (ScoreOutOfBoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
				
	}
													// 메서드 호출한 쪽에서 예외처리 해라
	private static int getScore(String subjectName) throws ScoreOutOfBoundException {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.printf("> %s 점수 입력 ? ", subjectName);
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if ( input.matches(regex) ) {
			score = Integer.parseInt(input);
			return score;
		} else {
			throw new ScoreOutOfBoundException("점수 범위(0~100) 벗어남");
		}
	}

}
