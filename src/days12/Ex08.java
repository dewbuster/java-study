package days12;

/**
 * @author dewbuster
 * @subject 객체(클래스) 배열
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		Point[] points = new Point[5000];
		
		//클래스 배열을 사용할 때 주의
		points[0] = new Point();
		
		points[0].x = 10;
		points[0].y = 20;
		points[0].dispPoint();
		
	} // main

} // class
