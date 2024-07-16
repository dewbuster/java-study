package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author dewbuster
 * @date 2024. 7. 16. - 오전 9:02:58
 * @subject 3반30명 이름,국,영,수,총,평,등,전교등수 입,출력
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;
		
		String[][] names = new String[CLASS_COUNT][STUDENT_COUNT];
		// 0면 국어, 1면 영어, 2면 수학, 3면 총점, 4면 등수, 5면 전교등수
		// 행 - 반
		// 열 - 학생들
		int[][][] infos = new int[6][CLASS_COUNT][STUDENT_COUNT];
		// 2반19번 수학
		// infos[2][1][18];
		double[][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];
		
		// 입력받은 학생 수 저장할 변수
		int[] counts = new int[CLASS_COUNT];
		char con = 'y';
		
		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		int ban; // 1,2,3
		do {
			//반 입력?
			System.out.print("> 반 입력? ");
			ban = scanner.nextInt();
			
			//그 반의 학생 정보 입력
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학 입력?: ", ban, counts[ban-1]+1);
			
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			rank = wrank = 1;
			
			names[ban-1][counts[ban-1]] = name;
			infos[0][ban-1][counts[ban-1]] = kor;
			infos[1][ban-1][counts[ban-1]] = eng;
			infos[2][ban-1][counts[ban-1]] = mat;
			infos[3][ban-1][counts[ban-1]] = tot;
			infos[4][ban-1][counts[ban-1]] = rank;
			infos[5][ban-1][counts[ban-1]] = wrank;
			avgs[ban-1][counts[ban-1]] = avg;
			
			counts[ban-1]++;
			//입력 계속
			System.out.print("> 입력 계속? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con) == 'Y');
		
		int 총학생수 = IntStream.of(counts).sum();
		System.out.printf("\t\t학생 정보 출력(%d명) \n", 총학생수);
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반 학생]: %d명 ]\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f 순위:%d 전교:%d\n"
						,names[i][j], infos[0][i][j], infos[1][i][j], infos[2][i][j], infos[3][i][j], avgs[i][j] ,infos[4][i][j], infos[5][i][j] );
			}
		}
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
