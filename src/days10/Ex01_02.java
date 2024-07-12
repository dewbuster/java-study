package days10;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex01_02 {
	static Scanner scanner = new Scanner(System.in);
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;
	static int count = 0;
	static char con = 'Y';
	static final int STUDENT_COUNT = 30;

	static String[] names = new String[STUDENT_COUNT];
	static int[] kors = new int[STUDENT_COUNT];
	static int[] engs = new int[STUDENT_COUNT];
	static int[] mats = new int[STUDENT_COUNT];
	static int[] tots = new int[STUDENT_COUNT];
	static int[] ranks = new int[STUDENT_COUNT];
	static double[] avgs = new double[STUDENT_COUNT];

	public static void main(String[] args) throws IOException {
		studentInfomationInput();
		studentInfomationOutput();
	} // main

	public static void studentInfomationOutput() {
		for (int i = 0; i < count; i++) {
			System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f 순위:%d\n"
					,names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i] );
		} // for
	}

	public static void studentInfomationInput() throws IOException {
		do {
			System.out.print("이름 입력 ? ");
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			rank = 1;
			avg = (double) tot / 3;

			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			ranks[count] = rank;

			System.out.print("계속 입력 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			count++;
		} while (Character.toUpperCase(con) == 'Y');
		
		processRank();

	}
	
	private static void processRank() {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if (tots[i] < tots[j]) ranks[i]++;
			}
		} // for
	}

	private static String getName() {
		Random rnd = new Random();
		String[] lastNames = { "김", "이", "박", "최", "권", "홍" };
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];
		
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1) + '가');
		}
		
		String firstName = String.valueOf(firstNames);
		name += firstName;
		
		return name;
	}

	public static int getScore() {
		return (int) (Math.random()*101);
	}

} // class
