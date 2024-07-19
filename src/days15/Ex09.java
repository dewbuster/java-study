package days15;

public class Ex09 {

	public static void main(String[] args) {
		// 클래스 간의 관계
		// has-a 관계 : Engine, Car
		// is-a 관계 : 
		
		// HEngine
		Engine hengine = new HEngine();
		Car c1 = new Car(hengine);
		Engine kengine = new KEngine();
		Car c50001 = new Car(kengine);
		
		Engine sengine = new SEngine();
		c50001.setEngine(sengine);
		
	} // main

} // class
