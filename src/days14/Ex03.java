package days14;
/**
 * @author dewbuster
 * @date 2024. 7. 18.-오전 10:28:26
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 객체(클래스) 복사와 복제
		// [ 생성자 복제 ]
		Point p1 = new Point(1,2);
		// Point p2 = p1;  클래스 복사
		
		/* 클래스 복제
		 * Point p2 = new Point();
		 * p2.x = p1.x
		 * p2.y = p1.y
		 */
		
		Point p2 = new Point(p1);
		System.out.println(p2.getX());
		
		
	} // main
	
} // class

// 컴파일러가 자동으로 Object 클래스 상속...
// 모든 클래스의 최상위 클래스는 java.lang.Object 이다.
class Point{ // extends Object
	int x, y;
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	String getXY() {
		return String.format("(%d, %d)", this.x, this.y);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}