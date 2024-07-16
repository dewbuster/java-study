package days12;

/**
 * @author User
 * @subject [객체(클래스) 복사Copy와 객체(클래스) 복제Clone]
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		t1.color = "red";
		System.out.println(t1.color);
		//객체 복사(copy)
		Tv t2 = t1;
		t2.color = "blue";
		System.out.println(t1.color);
		
		tvTest(t1);
		System.out.println(t1.color);
		
	} // main

	private static void tvTest(Tv t) {
		t.color = "Green";
		
	}

} // class
