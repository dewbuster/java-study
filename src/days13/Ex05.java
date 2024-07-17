package days13;
/**
 * @author dewbuster
 * @date 2024. 7. 17.-오후 12:34:25
 * @subject 생성자(constructor)
 * @content 1. 일종의 메서드이다.
 * 			2. 메서드명 == 클래스명
 * 			3. 리턴자료형 없음X void도 붙이지 않음
 *			4. 역할 : 필드 초기화
 *			5. 호출시기: 인위적으로 호출 X
 *						 객체 생성할 때 자동으로 호출
 *						 new Tv();
 *			6. 오버로딩 가능 O
 *			7. 디폴트 생성자(default constructor)
 *				: 매개변수가 없는 생성자
 *			8. 생성자는 상속되지 않는다
 *			9. 생성자는 접근지정자 O, 기타제어자 X
 *		   10. 컴파일러에 의해서 생성자가 1개도 없는 경우는 자동으로 디폴트생성자는 생성
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 객체(클래스) 배열
		Point2[] points = { 
				new Point2(10,20),
				new Point2(1,2)
		};
		
		/*
		p1.plusPoint(p2);
		p1.dispPoint();

		Point2 p3 = p1.plusPoint(p1, p2);
		p3.dispPoint();
		*/
		

	} // main

} // class
