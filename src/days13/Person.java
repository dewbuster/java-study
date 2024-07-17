package days13;

public class Person {
	// field
	private String name = "익명";
	private int age = 20;
	private boolean gender = false;
	
	// constructor
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int age, boolean gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// method
	public void dispPerson() {
		System.out.printf("> 이름:%s, 나이:%d\n", name, age);
	}
	
	// getter, setter  읽기전용, 쓰기전용, 유효성 검사
	public void setAge(int age) {
		if (0 <= age && age <= 150) {
			this.age = age;
		} else {
			throw new NullPointerException();
		}
	}
	public int getAge() {
		return age; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	// Alt+Shift+S
	
	
} // Person
