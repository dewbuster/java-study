package days22;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -1700884782834193335L;
	String name;
	// 객체를 직렬화할 때 password는 포함 X == transient 
	transient String password;
	int age;
	
	public User() {
		this("Unknow", "1234", 0);
	}
	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
