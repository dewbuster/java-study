package days12;

public class Ex11 {

	public static void main(String[] args) {
		// 기본형 or 참조형 메서드 (매개변수)
		//		리턴값		ㄴ 기본형 매개변수
		//					ㄴ 참조형 매개변수
		
		int[] m = new int[3];
		System.out.println(m.length);
		
		Ex11 ex = new Ex11();
		m = ex.increaseArray(m);
		System.out.println(m.length);
	}

	public int[] increaseArray(int[] m) {
		 int[] temp = new int[m.length + 3];
		 
		 return temp;
	}
}
