package days20;
/**
 * @author dewbuster
 * @date 2024. 7. 26.-오후 3:15:24
 * @subject
 * @content
 */
public class Ex08_03 {

	public static void main(String[] args) {
		// [제네릭의 제한]
		
	} // main

} // class

class Box2<T>{
	// Cannot make a static reference to the non-static type T
	// 1) 제한 - 제네릭 클래스에는 클래스변수(static)를 선언 X
	// static T item2;
	
	// 2) 제한 - 클래스메서드(static)에도 T 타입 변수 사용 X
//	static int compare (T a, T b) {
//		return 0;
//	}

	
}