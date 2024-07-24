package days18;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex02_02 {

	public static void main(String[] args) throws ParseException {
		// DecimalFormat
		int money = 3276500;
		/* 1
		String smoney = String.format("%,d", money);
		System.out.println(smoney);
		*/
		/* 2
		//String pattern = "#,###.00";
		//String pattern = "#,###.##";
		String pattern = "\u00A4 #,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		String smoney = df.format(money);
		System.out.println(smoney);
		*/
		
		String s = "3,123.23";
		String pattern = "#,###.00";
		DecimalFormat df = new DecimalFormat(pattern);
		double d = (double) df.parse(s);
		System.out.println(d);
		
	} // main
	
} // class
