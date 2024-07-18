package days14;
// static import 문
import static java.lang.Math.*;
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 1. 패키지(package)
		 * 	- 서로 관련 있는 클래스, 인터페이스들의 묶음
		 * 2. 클래스 효율적인 관리
		 * 3. 예)
		 * 		java.io 패키지
		 * 		java.net 패키지
		 * 		java.util 패키지
		 * 4. 패키지명 + 동일한 이름의 클래스
		 *    패키지명 충돌을 막기위해 도메인명을 패키지명으로 사용한다.
		 *    naver.com -> com.naver.프로젝트명
		 * 5. 패키지명 == 물리적으로 디렉토리 생성
		 *    java.io 패키지명		java폴더
		 *    						  ㄴ io 폴더 생성
		 * 6. 자바파일의 첫 문장에 package 패키지명;
		 * 7. 패키지명은 소문자로 작명한다.
		 * 8. 다른 패키지의 클래스를 사용할 때는
		 * 	  import 문을 사용해서 클래스가 포함된 패키지명을 적어준다.
		 * 9. 풀네임(full name)을 적으세요...
		 * 		패키지명.클래스명
		 * 10. import 문이 없는 경우에는 Ctrl + Shift + O 를 누르면 자동으로 import 완성
		 * 11. import java.io.*; -> java.io 패키지 안의 모든 클래스를 import
		 * 12. import java.lang.*; 컴파일러가 자동으로 추가
		 */
		
		System.out.println(PI);
		System.out.println(random());
		
	}
}
