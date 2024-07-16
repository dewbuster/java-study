package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {

	static Scanner scanner = new Scanner(System.in);
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;
	static int count = 0;
	static char con = 'Y';
	static final int STUDENT_COUNT = 30;
	
	static Student[] students = new Student[STUDENT_COUNT];
	
	public static void main(String[] args) throws IOException {
		// days10.Ex01_02.java -> 클래스 배열 사용 코딩 수정
		// Student.java
		studentInfomationInput();
		studentInfomationOutput();
	} // main

	public static void studentInfomationOutput() {
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t", i+1 );
			students[i].dispInfo();
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

			students[count] = new Student();
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;

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
				if (students[i].tot < students[j].tot) students[i].rank++;
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

}
