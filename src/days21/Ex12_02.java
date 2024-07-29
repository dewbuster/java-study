package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author dewbuster
 * @date 2024. 7. 29.-오후 4:29:05
 * @subject
 * @content
 */
public class Ex12_02 {

	public static void main(String[] args) throws IOException {
		int [] score = {
			// 번호 국  영  수
				1, 100, 90, 90,    // 4*4
				2, 70 , 90,100,
				3, 100,100,100,
				4, 70 , 60, 80,
				5, 70 , 90,100
		};

		String name = ".\\src\\days21\\score.dat";
		String mode = "rw";
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
	    	for (int i = 0; i < score.length; i++) {
				long fp = raf.getFilePointer();
				System.out.printf("> 현재 파일 포인터  : %d - [%d]\n",
						fp, score[i]);
				raf.writeInt(score[i]);
			}
	    } catch (Exception e) {
	    	  e.printStackTrace();
	    }
		
		// 일시정지 + 엔터 계속.
	    System.out.println("> 엔터치면 진행한다.");
	    System.in.read();
	    System.in.skip( System.in.available() ); // 13,10 제거

	    // 모든 학생의 번호,국,영,수 성적 정보를 출력..( score.dat )
	    int no , kor, eng, mat;
	    int tot;
	    double avg;
	    
	    try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
	    	for (int i = 0; i < score.length / 4; i++) {
	    		no = raf.readInt();
	    		kor = raf.readInt();
	    		eng = raf.readInt();
	    		mat = raf.readInt();
	    		tot = kor + eng + mat;
	    		avg = (double) tot / 3;

	    		System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n"
	    				, no, kor, eng, mat, tot, avg);
			}

	    } catch (Exception e) {
	    	  e.printStackTrace();
	    }
	    
	 // 일시정지 + 엔터 계속.
	    System.out.println("> 엔터치면 진행한다.");
	    System.in.read();
	    System.in.skip( System.in.available() ); // 13,10 제거
	    
	 // 문제 
	      // ㄱ. 3번 학생의 수학점수(100-> 20) 점 수정.
	      // ㄴ. 3번 학생만 성적 정보를 출력.
	      // 번호:3, 국어:100, 영어:100, 수학:100, 총점:300, 평균:100.00
	    try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
	    	raf.seek(16 * 2 +4 +4 +4);
	    	raf.writeInt(20);
	    	raf.seek(16 * 2);
	    	no = raf.readInt();
	    	kor = raf.readInt();
	    	eng = raf.readInt();
	    	mat = raf.readInt();
	    	tot = kor + eng + mat;
	    	avg = (double) tot / 3;

	    	System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n"
	    			, no, kor, eng, mat, tot, avg);

	    } catch (Exception e) {
	    	  e.printStackTrace();
	    }
	}
}
