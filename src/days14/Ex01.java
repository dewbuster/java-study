package days14;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		//6. [취업 문제] ego(자아)
		String n = "keNik";
		String m= "kKnie";
		
		char[] ns = n.toUpperCase().toCharArray();
		char[] ms = m.toUpperCase().toCharArray();
		Arrays.sort(ns);
		Arrays.sort(ms);
		
		int a = Arrays.compare(ns, ms);
		
		if (a == 0) System.out.println(true);
		else System.out.println(false);
	}
}
