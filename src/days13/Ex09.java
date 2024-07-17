package days13;

public class Ex09 {
	// 필드
	// 클래스 변수
	static String name;

	public static void main(String[] args) {
		Ex09.name = "ddd";
	}
	
	public static void test() {
		Ex09.name = "rrr";
	}
	
	// sum 메서드 static 을 붙이지 않으면 new Ex09() 객체 생성해야 메서드가 메모리에 생성됨.
	
	public static int sum(int a, int b) {
		return a+b;
	}

}
