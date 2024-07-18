package days14;

public class Ex11_02 {

	public static void main(String[] args) {
		// Employee emp = new Employee();
		// 업캐스팅 된 객체만 다운캐스팅 가능
		// Regular emp2 = (Regular) emp; -> 오류. 원래 Employee 인 객체는 다운캐스팅 X
			
		Regular emp = new Regular();
		test ( emp ); // -> 업캐스팅 되어 전달
	}

	public static void test(Employee emp) {
		// 들어온 객체를 확인해서 instanceof 연산자로 다운캐스팅 해서 씀
	}
}
