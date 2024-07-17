package days13;

public class Point2 {
	private int x;
	private int y;
	
	// 생성자를 하나라도 만들면 default 생성자는 자동생성 되지 X
	public Point2() {
		
	}
	
	public Point2(int a, int b) {
		x = a;
		y = b;
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

	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
	
	public void plusPoint(Point2 p) {
		x = x + p.x;
		y = y + p.y;
	}
	
	public Point2 plusPoint(Point2 p1, Point2 p2) {
		int x = p1.x + p2.x;
		int y = p1.y + p2.y;
		Point2 p = new Point2();
		p.x = x;
		p.y = y;
		return p;
	}
	

}
