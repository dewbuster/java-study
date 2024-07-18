package days14;
/**
 * @author dewbuster
 * @date 2024. 7. 18.-오전 11:40:02
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [상속관계 (is-a 관계)]
		// - 상속(inheritance)
		//	  기존 클래스를 재사용하여 새로운 클래스를 선언하는 것.
		//				멤버들
		// - 장점: 코드 재사용 -> 생산성 향상, 유지보수 용이
		// [접][기] class 클래스명 extentds {
		//      멤버 ( 필드, 메서드 )
		// }
		
		//Point3D p1 = new Point3D(1, 2, 3);
		//System.out.println(p1.x);
		new Point3D(1, 2, 3);
		
	} // main
} // class

class Point3D extends Point2D{
	int z;
	Point3D() {
		System.out.println("Point3D 객체 생성 - 디폴트 생성자 호출");
	}
	Point3D(int x, int y, int z) {
		// 부모(super)클래스로부터 물려받은 필드 초기화
		// this.x = x;
		// this.y = y;
		super(x, y);
		this.z = z;
		System.out.println("Point3D 객체 생성 - 인자3 생성자 호출");
	}
}

// 기존 클래스
class Point2D {
	int x;
	int y;
	
	Point2D() {
		System.out.println("Point2D 객체 생성 - 디폴트 생성자 호출");
	}
	Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D 객체 생성 - 인자2 생성자 호출");
	}
}
