package days16;

import java.util.StringTokenizer;

public class Ex08 {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		String s = "이시훈, 원충희, 김준석, 송세호";
		String regex = "\\s*,\\s*";
		s.replace(" ", "");
		StringTokenizer st = new StringTokenizer(s, ",");
		
		/*
		String[] names = s.split(regex);
		for (String string : names) {
			System.out.println(name);
		}
		*/
	}

}
