package days15;

import days14.Employee;

public class Ex01 {

	public static void main(String[] args) {
		
		Employee emp3 = new SalesMan("김준석", "경기도 남양주"
				, "010-9837-2342", "2021.03.12", 500000, 20, 70000);
		
		// 업캐스팅 되어 오버라이딩 함수 실행하면 
		// 서브클래스에 가서 최종 오버라이딩 된 함수로 실행됨
		emp3.dispEmpInfo();
		
		Employee emp4 = new Temp("김재민", "서울 목동", "010-2319-4322"
				, "2020.01.01", 20, 250000);
		emp4.dispEmpInfo();
	}

}
