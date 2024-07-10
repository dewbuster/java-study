package days08;

import java.util.Calendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String rrn;
		do {
			System.out.printf("주민번호 입력 ? ");
			rrn = scanner.next();
			
		} while (!rrn.matches("\\d{6}-\\d{7}"));
		
		
		int americanAge = getAmericanAge(rrn);
		System.out.println(americanAge);
	}

	public static int getAmericanAge(String rrn) {
		
		int gender = Integer.parseInt(rrn.substring(7,8));
		int year = 1800;
		switch (gender) {
		case 1: case 2: case 5: case 6:
			year =1900;
			break;
		case 3: case 4: case 7: case 8:
			year =2000;
			break;
		default:
			year =1800;
			break;
		}

		// int year = 1900
		int birthYear = year + Integer.parseInt(rrn.substring(0,2));
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		int age = thisYear - birthYear;
		
		int thisMonth = cal.get(Calendar.MONTH) + 1;
		int thisDay = cal.get(Calendar.DATE);

		int thisMD = thisMonth * 100 + thisDay;
		int birthMD = Integer.parseInt(rrn.substring(2,6));

		
		if (thisMD < birthMD) {
			age--;
			System.out.println("생일지나지 않음");
		}
		
		return age;
	}

}
