package days12;

public class Tv {
	
	// 멤버(구성요소)
	//  ㄴ 멤버변수(필드) - 속성(property)
	//    ㄴ [접][기] 자료형 필드명 = [초기값];
	// 지역변수는 초기화하지 않으면 사용할 수 없다.
	// 필드의 변수는 초기화하지 않아도 기본값 적용.
	public boolean power;  //(기본값으로 초기화되어 있음: false)
	public int channel = 1;
	public String color = null;
	
	// 멤버함수==메서드(method)==동작(기능)
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}
