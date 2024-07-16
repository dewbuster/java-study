package days12;

public class Ex03 {

	public static void main(String[] args) {
		// 클래스 - 객체의 설계도
		// 객체 - 클래스를 자료형으로 선언된 참조변수
		//Tv t1; -> 객체 
		// new Tv(); -> 인스턴스화
		// 인스턴스 힙영역->[power][channel][color][p..()메서드주소값][c..()메서드주소값][c..()메서드주소값]
		// 함수코드 영역에 power(),channelUp(),channelDown() 올라감.
		Tv t1 = new Tv();
		// 멤버들을 접근하는 방법: 객체명.필드명, 객체명.메서드명()
		t1.power();
		System.out.println(t1.power ? "O" : "X");
		
		t1.channel = 10;
		System.out.println(t1.channel);
		
		t1.channelDown();
		System.out.println(t1.channel);
		
		t1.power();
		System.out.println(t1.power ? "O" : "X");
	}

}
