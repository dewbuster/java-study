package days18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author dewbuster
 * @date 2024. 7. 24.-오전 10:38:41
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) throws ParseException {
		/* 1.
		Calendar c = Calendar.getInstance();
		String pattern = "yyyy.MM.dd (E) hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String s = sdf.format(c.getTime());
		System.out.println(s); // c.getTime으로 Calendar -> Date로 변환해 입력
		*/
		
		/* 2.
		String s = "2019/05/01 01:59:29";
		Date d = new Date(s);
		System.out.println(d.toLocaleString());
		*/
		
		String s = "2024.07.24 (수)";
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(s);
		System.out.println(d.toLocaleString());
		// Date -> Calendar 변환
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		
		
		
	}

}
