package days10;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		final int STUDENT_COUNT = 30;

		String[] names = new String[STUDENT_COUNT];
		int[] kors = new int[STUDENT_COUNT];
		int[] engs = new int[STUDENT_COUNT];
		int[] mats = new int[STUDENT_COUNT];
		int[] tots = new int[STUDENT_COUNT];
		int[] ranks = new int[STUDENT_COUNT];
		double[] avgs = new double[STUDENT_COUNT];

		int count = studentInfomationInput(scanner, names, kors, engs, mats, tots, ranks, avgs);
		studentInfomationOutput(names, kors, engs, mats, tots, ranks, avgs, count);

	} // main

	public static void studentInfomationOutput(String[] names, int[] kors, int[] engs, int[] mats, int[] tots,
			int[] ranks, double[] avgs, int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f 순위:%d\n"
					,names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i] );
		} // for
	}

	public static int studentInfomationInput(Scanner scanner, String[] names, int[] kors, int[] engs, int[] mats,
			int[] tots, int[] ranks, double[] avgs) throws IOException {
		String name;
		int kor, eng, mat, tot, rank;
		double avg;
		int count = 0;
		char con = 'Y';
		do {
			System.out.print("이름 국어 영어 수학 입력 ? ");
			name = scanner.next();
			kor = scanner.nextInt();
			eng = scanner.nextInt();
			mat = scanner.nextInt();
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
		
		for (int i = 0; i < avgs.length; i++) {
			ranks[i] = 1;
			for (int j = 0; j < avgs.length; j++) {
				if (avgs[i] < avgs[j]) ranks[i]++;
			}
		} // for
		
		return count;
	}

} // class
