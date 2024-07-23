package days17;
/**
 * @author dewbuster
 * @date 2024. 7. 23.-오후 12:14:27
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [java.lang.Math 클래스]
		// Math + 모든 멤버들(필드,메서드) : static
		// 클래스명.멤버명
		System.out.println(Math.random());
		System.out.println(Math.pow(2,3));
		System.out.println(Math.max(2,3));
		System.out.println(Math.min(2,3));
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(-3.99));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println("=".repeat(30));
		// 암기
		// ceil 올림 == 절상 리턴값 double 소수점 첫번째 자리에서 절상
		System.out.println(Math.ceil(2.0));     //2.0
		System.out.println(Math.ceil(2.178));   //3.0
		System.out.println(Math.ceil(2.578));   //3.0
		System.out.println(Math.ceil(2.978));   //3.0
		System.out.println("=".repeat(30));
		// round 반올림   리턴값 int
		System.out.println(Math.round(2.0));     // 2
		System.out.println(Math.round(2.178));   // 2
		System.out.println(Math.round(2.578));   // 3
		System.out.println(Math.round(2.978));   // 3
		System.out.println("=".repeat(30));
		// floor 내림 == 절삭  리턴값 double
		System.out.println(Math.floor(2.0));    // 2.0
		System.out.println(Math.floor(2.178));  // 2.0
		System.out.println(Math.floor(2.578));  // 2.0
		System.out.println(Math.floor(2.978));	// 2.0

	} // main

} // class
