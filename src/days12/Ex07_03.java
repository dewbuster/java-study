package days12;
/**
 * @author dewbuster
 * @subject
 * @content
 */
public class Ex07_03 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		
		System.out.printf("x=%d, y=%d\n", p1.x, p1.y);
		
		swap( p1 ); // call by reference
		
		System.out.printf("x=%d, y=%d\n", p1.x, p1.y);
		
		
	} // main

	private static void swap(Point p1) {
		int temp = p1.x;
		p1.x = p1.y;
		p1.y = temp;
	}

} // class
