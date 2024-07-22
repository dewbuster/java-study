package days16;
/**
 * @author dewbuster
 * @date 2024. 7. 22.-오후 2:13:31
 * @subject [ 객체로부터 Class 객체를 얻어오는 방법 3가지 ]
 * @content Class 클래스 타입?
 * 			(시험)
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. Object.getClass()
		Person p1 = new Person("123456-1234567", "홍길동");
		Class cls = p1.getClass();
		// 2. 모든 클래스마다 class 클래스 변수가 있다.
		Class cls2 = Person.class;
		// Person p1 = new Person()
		try {
			Person p2 = (Person) cls2.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		// 3. Class.forName()
		String fullName = "days16.Person";
		try {
			Class cls3 = Class.forName(fullName); // JDBC
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} // main

} // class
