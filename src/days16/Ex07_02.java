package days16;

public class Ex07_02 {

	public static void main(String[] args) {
		
		//test_String(); // > String 처리 시간 : 4493ms
		test_StringBuilder();  // > String 처리 시간 : 3ms
	} // main
	
	private static void test_StringBuilder() {
		long start = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 200000; i++) {
			s.append("a");
		}
		long finish = System.currentTimeMillis();
		System.out.printf("> String 처리 시간 : %dms\n", (finish-start));
	}

	private static void test_String() {
		long start = System.currentTimeMillis();
		String s = "a";
		for (int i = 0; i < 200000; i++) {
			s += "a";
		}
		long finish = System.currentTimeMillis();
		System.out.printf("> String 처리 시간 : %dms\n", (finish-start));
		
		
	}
} // class
