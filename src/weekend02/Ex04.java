package weekend02;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	static String[][] names = new String[3][30];
	static int[][] kors = new int[3][30];
	static int[][] engs = new int[3][30];
	static int[][] mats = new int[3][30];
	static int[][] tots = new int[3][30];
	static double[][] avgs = new double[3][30];
	static int[][] ranks = new int[3][30];
	static int[][] allRanks = new int[3][30];
	static Scanner scanner = new Scanner(System.in);
	static int index[] = new int[3]; 
			
	public static void main(String[] args) throws IOException {
		
		inputStudentInfo();
		outputStudentInfo();
		
	}

	public static void outputStudentInfo() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < index[i]; j++) {
				System.out.printf("%d반 %d번 : %s, %d, %d, %d, 총점:%d, 평균:%.2f, 등수:%d, 전교:%d", i+1, j+1
						, names[i][j], kors[i][j], engs[i][j], mats[i][j], tots[i][j], avgs[i][j], ranks[i][j]
								, allRanks[i][j]);
				System.out.println();
			}
		System.out.println("=".repeat(20));
		}
	}

	public static void inputStudentInfo() throws IOException {
		String strClassNumber;
		String regex = "[1-3]";
		char con = 'Y';
		do {
			do {
				System.out.print("추가할 학생의 반(1-3)을 입력하세요");
				strClassNumber = scanner.next();	
			} while (!strClassNumber.matches(regex));
			
			int classNumber = Integer.parseInt(strClassNumber)-1;
			if (index[classNumber] >= 30) {
				System.out.println("해당 반은 다 찼습니다.");
			} else {
				names[classNumber][index[classNumber]] = getName();
				kors[classNumber][index[classNumber]] = getScore();
				engs[classNumber][index[classNumber]] = getScore();
				mats[classNumber][index[classNumber]] = getScore();
				tots[classNumber][index[classNumber]] = kors[classNumber][index[classNumber]] 
						+ engs[classNumber][index[classNumber]]+ mats[classNumber][index[classNumber]];
				avgs[classNumber][index[classNumber]] = (double)tots[classNumber][index[classNumber]] / 3;
				ranks[classNumber][index[classNumber]] = 1;
				allRanks[classNumber][index[classNumber]] = 1;
				index[classNumber]++;
			}
			System.out.print("계속 하시겠습니까?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con) == 'Y');
		
		processRank();
		//processAllRank();
	}

/* TODO
	public static void processAllRank() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < index[i]; j++) {
				for (int k = 0; k < index[i]; k++) {
					if (tots[i][j] > tots[j][k]) allRanks[i][j]++;
				}
			}
		}
		
	}
*/

	public static void processRank() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < index[i]; j++) {
				for (int k = 0; k < index[i]; k++) {
					if (tots[i][j] > tots[i][k]) ranks[i][j]++;
				}
			}
		}
	}

	public static int getScore() {
		return (int)(Math.random()*101);
	}

	public static String getName() {
		String[] lastName = {"김", "나", "박", "이"};
		Random rnd = new Random();
		String name = lastName[rnd.nextInt(lastName.length)];
		
		char[] firstNames = new char[2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣'-'가'+1)+'가');
		}
		String firstName = String.valueOf(firstNames);
		name += firstName;
		return name;
	}
}
