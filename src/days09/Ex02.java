package days09;
/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오전 10:23:38
 * @subject 년도를 입력받아서 윤년/평년 체크
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		// 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		// year % 4 == 0
		// 100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다. 
		// year % 100 == 0 && year % 400 != 0 평년조건식
		
		// year % 4 == 0 && year % 100 != 0 || year % 400 == 0  윤년
 		
		int count = 0;
		for (int i = 1; i < 2020; i++) {
			if (isLeapYear(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("1~2019 윤년: " + count);
		
	} // main
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		return false;
	}
	
} // class
