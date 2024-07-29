package days21;

import java.io.FileWriter;

/**
 * @author dewbuster
 * @date 2024. 7. 29.-오후 2:29:38
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		// [DataInputStream / DataOutputStream]
		// 바이트 스트림
		// 기본형 8가지를 읽기/쓰기
		
		String name = "홍길동";
		int kor = 98, eng = 89, mat = 20;
		int tot = kor + eng + mat;
		double avg = (double) tot / 3;
		boolean gender = true;
		
		// student.txt 파일로 저장
		String fileName = ".\\src\\days21\\student.txt";
		try (FileWriter wirter = new FileWriter(fileName)){
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
