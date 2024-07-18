package days14;
/**
 * @author dewbuster
 * @date 2024. 7. 18.-오후 2:07:49
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		/*
		 * 			[상속 계층도]
		 * 				Object
		 * Point					Shape 도형클래스
		 * 							
		 * 						 Circle원, Triangle삼각형, Square사각형
		 * is - a 관계
		 * 원은 도형이다. 삼각형은 도형이다.
		 */

		
	} // main
} // class

class Shape{
	
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n", this.color);
	}
	
	void 면적계산() {
		
	}
	
}

class Circle extends Shape{
	
	// 원점, 반지름
	Point center;   // has-a 관계
	int r;   // radius
	
	Circle()
	{
		this(0,0,0);
	}
	Circle(int x, int y, int r)
	{
		this.center = new Point(x,y);
		this.r = r;
	}
	Circle(Point center, int r)
	{
		this.center = center;
		this.r = r;
	}
	
	@Override
	void 면적계산() {
		// 반지름 * 반지름 * 3.14
	}
	
	
}

class Triangle extends Shape{
	
	Point [] p = null;
	
	public Triangle(Point[] p) {
		this.p = p;
	}
	
	@Override
	void 면적계산() {
		
	}
	
}