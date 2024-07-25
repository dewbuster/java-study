package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		solution("abc1Addfggg4556bdd",   6);
		/*
		LocalDateTime ldt = LocalDateTime.of(2023, 8, 11, 7, 2, 32, 259);
		String pattern = "yyyy/MM/dd EEE   hh:mm:ss.SSS";
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern(pattern);
		String s = df1.format(ldt);
		System.out.println(s);

		String s = "2023.08.11 (금)";
		String pattern = "yyyy.MM.dd (E)";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d2 = LocalDate.parse(s, dtf);
		System.out.println(d2);
		 */

	}

	public static String[] solution(String my_str, int n) {
		ArrayList list = new ArrayList();

		int i = 0;
		String str = null;
		try {
			while(true) {
				str = my_str.substring(i*n, (i+1)*n);
				System.out.println(i + " : " + str);
				list.add(str);
				i++;
			} // while
		} catch (StringIndexOutOfBoundsException e) {
			str = my_str.substring(i*n);
			if (str.length() != 0) {
				System.out.println(i + " : " + str);
				list.add(str);				
			}
		}
		// String[] -> ArrayList 변환(검색)d
		// ArrayList -> String [] 변환
		String[] answer = (String[]) list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(answer));
		return answer;
	}

}
