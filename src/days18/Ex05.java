package days18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

public class Ex05 {
	
	public static void main(String[] args) throws IOException {
		// 한반 30명 학생성적처리
		// ㄱ. 배열
		// ㄴ. 클래스 배열
		// ㄷ. 클래스 ArrayList 사용 + Student 클래스 요소
		Scanner scanner = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		char con = 'Y';
		final int STUDENT_COUNT = 30;
		
		ArrayList<Student> list = new ArrayList<Student>(STUDENT_COUNT);
		
		do {
			System.out.printf(" %d번 이름 입력 ? ", list.size()+1);
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			rank = wrank = 1;
			avg = (double) tot / 3;

			Student s = new Student(name, kor, eng, mat, tot, rank, wrank, avg);
			
			list.add(s);

			System.out.print("계속 입력 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');
		
		processRank(list);
		
		System.out.printf("총 학생수 : %d\n", list.size());
		Iterator<Student> ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}

	}
	public static void processRank(ArrayList<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).tot < list.get(j).tot) list.get(i).rank++;
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
