package days09;

/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오후 12:32:59
 * @subject 재귀함수
 * @content
 *
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		disp();
		
	} // main

	private static void disp() {
		System.out.println(" disp() ...");
		disp();
	}
	
} // class
