package days16;

public class Ex03 {

	public static void main(String[] args) {
		// [java.lang 패키지 - 자바 가장 기본이 되는 클래스 ]
		// java.util 패키지 - 유용한 클래스
		// 1. [java.lang.Object 클래스]
		Item item1 = new Item(10);
		Item item2 = new Item(10);
		// ㄱ. int hashCode()
		//	   생성된 객체의 주소값을 해싱기법을 사용해서 해시코드를 만들어 반환
		System.out.println(item1.hashCode());
		System.out.println(item2.hashCode());
		
		//	ㄴ. String toString()
		//		인스턴스에 대한 정보를 문자열로 반환
		//		보통 오버라이딩 해서 사용
		//			days16.Item@73a28541
		//			패키지.클래스명@hashCode의 16진수값
		System.out.println(item1.toString());
		
		//	ㄷ. getClass()
		//		객체 자신의 클래스 정보를 담고 있는 Class 인스턴스를 반환
		// Class<? extends Item> item1.getClass();
		Class cls = item1.getClass();
		System.out.println(cls.getName()); // 풀네임
		// cls.getConstructors() // 어떤 생성자가 있는지
		// cls.getMethods(); // 어떤 메서드가 있는지
		
		//	ㄹ. clone()  객체의 복사본 만들어 반환
		//	
		
	}

}

class Item extends Object{
	
	@Override
	public String toString() {
		return "Item [value=" + value + "]";
	}

	int value;
	
	Item(int value){
		this.value = value;
	}
	
	
}
