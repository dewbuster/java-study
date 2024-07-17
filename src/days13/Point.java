package days13;

public class Point {
	//field
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}
	public Point plusPoint(int temp) {
		//Point p = new Point(this.x + temp, this.y + temp);
		thisTest(this);
		return this;
	}

	private void thisTest(Point p) {
		p.dispPoint();
	}

	//method
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}

	// Duplicate method plusPoint(Point) in type Point
	
	public void plusPoint(Point p) {
		x = x + p.x;
		y = y + p.y;
	}
	public Point plusPoint(Point p1, Point p2) {
		int x = p1.x + p2.x;
		int y = p1.y + p2.y;
		Point p = new Point();
		p.x = x;
		p.y = y;
		return p;
	}
	

}
