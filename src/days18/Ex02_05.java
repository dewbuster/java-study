package days18;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex02_05 {

	public static void main(String[] args) throws ParseException {
		
		String s = "[팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)";
		
		String pattern = "[팀장]{0}(전), {1}(비), {2}(전), {3}(비), {4}(비)";
		MessageFormat mf = new MessageFormat(pattern);
		Object[] names = mf.parse(s);
		for (Object v : names) {
			System.out.println(v);
		}
	}

}
