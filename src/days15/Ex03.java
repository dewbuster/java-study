package days15;

import days14.Employee;
import days14.Regular;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [다형성(polymorphism)]
		 *	- 여러 가지 형태를 가질 수 있는 능력
		 *	- E e1 = new R();
		 *	- E e1 = new S();
		 *	- E e1 = new T();
		 *	한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있는 것.
		 * 
		 */
		/*
		Employee emp1 = new Regular("송세호", "서울 강남구", "010-1234-1234"
				, "2002.12.12", 4000000);
		
		SalesMan emp2 = new SalesMan("김준석", "경기도 남양주"
				, "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		
		Employee emp3 = new Temp("김재민", "서울 목동", "010-2319-4322"
				, "2020.01.01", 20, 250000);
		
		System.out.println(emp1.getPay());
		System.out.println(emp2.getPay());
		System.out.println(emp3.getPay());
		*/
		/*
		Employee[] emps = new Employee[3];
		emps[0] = new Regular("송세호", "서울 강남구", "010-1234-1234"
				, "2002.12.12", 4000000);
		emps[1] = new SalesMan("김준석", "경기도 남양주"
				, "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		emps[2] = new Temp("김재민", "서울 목동", "010-2319-4322"
				, "2020.01.01", 20, 250000);
		*/
		// 클래스 배열 초기화
		Employee[] emps = {
							new Regular("송세호", "서울 강남구", "010-1234-1234"
									, "2002.12.12", 4000000),
							new SalesMan("김준석", "경기도 남양주"
									, "010-9837-2342", "2021.03.12", 500000, 20, 70000),
							new Temp("김재민", "서울 목동", "010-2319-4322"
									, "2020.01.01", 20, 250000)
						};
		for (Employee e : emps) {
			//System.out.println(e.getPay());
			printEmpPay(e);
		}
		
	} // main
	
	//						매개변수 다형성
	public static void printEmpPay(Employee emp) {
		// emp 에 담긴 객체가 R/S/T 인지 파악 instanceof연산자 -> 다운캐스팅 처리
		String type = null;
		if ( emp instanceof Temp) {
			type = "임시직 사원";
			Temp t = (Temp) emp;
			//
		}  else if (emp instanceof SalesMan) { // instanceof 자식부터 검사해야함. 
			type = "영업직 사원";
			SalesMan t = (SalesMan) emp;
			//
		} else if (emp instanceof Regular) {  // Sales맨이 들어와도 참이기 때문에 나중에 체크
			type = "정규직 사원";
			Regular t = (Regular) emp;
			//
		}
		System.out.println(type);
		
		System.out.println(emp.getPay());
	}
	
} // class
