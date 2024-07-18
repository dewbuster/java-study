package days14;

public class Car {

	// field
	String name;
	String gearType;
	int door;
	private Engine engine = null;
	// Engine engine = new Engine(); 결합력이 높은 코딩 X // has-a 관계
	
	// constructor
	Car() { 
		this.engine = new Engine();
	}
	Car(Engine engine) { 
		this.engine = engine;
	}
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// method
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}
}
