package days19;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days12.Student;

public class Ex08 {

	public static void main(String[] args) throws IOException {

		ArrayList<ArrayList<Student>> students = new ArrayList<ArrayList<Student>>();

		students.add(new ArrayList<Student>());
		students.add(new ArrayList<Student>());
		students.add(new ArrayList<Student>());

		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("> 반 입력? ");
			int ban = scanner.nextInt() -1;

			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = wrank = 1;
			
			students.get(ban).add(new Student(name, kor, eng, mat, tot, rank, wrank, avg));

			System.out.print("> 입력 계속? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y');
		
		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < students.get(i).size(); j++) {
				
				for (int i2 = 0; i2 < students.size(); i2++) {
					for (int j2 = 0; j2 < students.get(i2).size(); j2++) {
						if (students.get(i).get(j).tot < students.get(i2).get(j2).tot) {
							students.get(i).get(j).wrank++;
							if(i == i2) {
								students.get(i).get(j).rank++;
							}
						}
					}
				}
			}
		}
		
		int count = 1;
		Iterator<ArrayList<Student>> ir = students.iterator();
		while (ir.hasNext()) {
			ArrayList<Student> arr = (ArrayList<Student>) ir.next();
			if (arr.size()!=0)System.out.printf("[%d반]\n", count++);
			Iterator<Student> ir2 = arr.iterator();
			while (ir2.hasNext()) {
				Student student = (Student) ir2.next();
				System.out.println(student);
			}
			if (arr.size()!=0)System.out.println("-".repeat(40));
		}
		
		scanner.close();
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
