package days20;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import days12.Student;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;

		ArrayList<Student> c1List = new ArrayList<>(STUDENT_COUNT);
		ArrayList<Student> c2List = new ArrayList<>(STUDENT_COUNT);
		ArrayList<Student> c3List = new ArrayList<>(STUDENT_COUNT);

		ArrayList<ArrayList<Student>> sList = new ArrayList<>(); 

		sList.add(c1List);
		sList.add(c2List);
		sList.add(c3List);

		char con = 'y';

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;

		Scanner scanner = new Scanner(System.in);

		int cIdx;
		do {
			System.out.print("> 반 입력? ");
			cIdx = scanner.nextInt() -1;

			ArrayList<Student> cList = sList.get(cIdx);

			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력?: ", cIdx+1, cList.size()+1);

			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = wrank = 1;

			Student s = new Student(name, kor, eng, mat, tot, rank, wrank, avg);

			cList.add(s);

			System.out.print("> 입력 계속? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');
		
		//등수 처리
		for (int i = 0; i < sList.size(); i++) {
			for (int j = 0; j < sList.get(i).size(); j++) {
				
				for (int i2 = 0; i2 < sList.size(); i2++) {
					for (int j2 = 0; j2 < sList.get(i2).size(); j2++) {
						if (sList.get(i).get(j).tot < sList.get(i2).get(j2).tot) {
							sList.get(i).get(j).wrank++;
							if(i == i2) {
								sList.get(i).get(j).rank++;
							}
						}
					}
				}
			}
		}
		// 출력
		Iterator<ArrayList<Student>> ir = sList.iterator();
		while (ir.hasNext()) {
			ArrayList<Student> cList = ir.next();
			System.out.println("=".repeat(50));
			System.out.printf("총학생수 : %d명\n", cList.size());
			Iterator<Student> ir2 = cList.iterator();
			while (ir2.hasNext()) {
				Student s = ir2.next();
				System.out.println(s);
			}
		} // while
	}

	public static String getName() {
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
