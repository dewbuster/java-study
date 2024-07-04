package days04;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 5:11:11
 * @subject
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		// 1~n까지의 합
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력 ? ");
		int n = scanner.nextInt();
		
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		
		scanner.close();
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		int kor;
		System.out.print("국어 점수 입력 ? ");
		kor = scanner.nextInt();
		
		if (90 <= kor && kor <= 100) {
			System.out.println("수");
		} else if (80 <= kor && kor <= 89){
			System.out.println("우");
		} else if (70 <= kor && kor <= 79){
			System.out.println("미");
		} else if (60 <= kor && kor <= 69){
			System.out.println("양");
		} else if (0 <= kor && kor <= 59 ) {
			System.out.println("가");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
	
		scanner.close();

	}

}


/*
* [문제1] 국어점수를 입력받아서 수100~90/우80~89/미70~79/양60~69/가0~59 출력 (if문)
* [문제2] 국어점수를 입력받아서 수/우/미/양/가 출력 (switch문)
* [문제3] 1~10까지의 홀수의 합( for문 )
* [문제4] 1~10까지의 홀수의 합( while문 )
* [문제5] 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
*
*/