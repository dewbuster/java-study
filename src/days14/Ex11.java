package days14;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * [4개 클래스]
		 * 		Object
		 *   ↑			↑
		 * 	Temp	Employee  사원 클래스(공통적으로 가지고 있는 멤버)
		 * 			    ↑
		 * 			Regular 정규직 사원 클래스
		 * 				↑
		 * 			SalesMan 영업직 사원 클래스
		 * [개념 설명]
		 * 1. 상속
		 * 2. 오버로딩 / 오버라이딩
		 * 3. this / super 키워드 설명
		 * 4. 추상메서드, 추상 클래스 설명
		 * 5. 인터페이스 설명
		 * 6. 다형성 설명
		 * 7. 업캐스팅 / 다운캐스팅 (클래스 간의 형변환)	
		 * 
		 *  lombok 설치
		 */
		
		// 1. 사원 객체 생성해서 출력
		// Employee emp1 = new Employee("송세호", "서울 강남구", "010-1234-1234", "2002.12.12");
		// emp1.dispEmpInfo();
		
		//2.
		/*
		Regular emp2 = new Regular("송세호", "서울 강남구", "010-1234-1234"
				, "2002.12.12", 4000000);
		emp2.dispEmpInfo();      // 기본급 출력 X
		System.out.println( emp2.getPay() );
		*/
		// 2-2 다형성 이해
		
		// 부모타입			자식객체
		// 정규직(R)은 사원(E)이다.
		// [클래스 간의 형변환]
		// 업캐스팅(upcasting) 자동 형변환 - 자식을 부모에게 참조시킴
		// 상속관계가 없는 클래스들 간의 형변환 X
		Employee emp2 = new Regular("송세호", "서울 강남구", "010-1234-1234"
				, "2002.12.12", 4000000);
		emp2.dispEmpInfo();
		// System.out.println( emp2.getPay() );
		
		// 다운캐스팅(downcasting): 부모객체를 자식객체로 형변환
		// cast 연산자를 사용해서 강제 형변환
		Regular emp3 = (Regular)emp2;
		
		int i = 100;
		long l = i;
		
	} // main

} // class
