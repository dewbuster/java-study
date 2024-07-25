package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Test5 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Person p = new Person("홍길동", 23);
		Person p1 = new Person("김기훈", 33);
		Person p2 = new Person("박성훈", 25);
		Person p3 = new Person("이시훈", 29);
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		list.sort((Person o1, Person o2) -> o1.name.compareTo(o2.name));
	
		Iterator<Person> ir = list.iterator();
		while (ir.hasNext()) {
			Person person = (Person) ir.next();
			System.out.println(person.name);
		}
	}
}

@Data
@AllArgsConstructor
class TestClass{
	private String name;
	private int age;
}
