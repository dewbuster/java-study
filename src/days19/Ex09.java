package days19;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Ex09 {

	public static void main(String[] args) {
		// List : AL, V, LL, S, LL(DQ,Q), PQ, 
		// Set : HashSet, LinkedHashSet;
		//			순서X, 중복X
//		new Person("kenik", "홍길동", 20);
		/*
		new Person()
		.builder()
		.name("홍길동")
		.age(20)
		.id("kenik)")
		.build();
		*/
		
		Set s = new LinkedHashSet();
		s.add(new Person("kenik", "홍길동", 20));
		s.add(new Person("admin", "관리자", 40));
		s.add(new Person("hong", "홍길남", 25));
		
		//ID가 똑같은 Person 객체는 중복처리를 해서 추가 X
		
		s.add(new Person("admin", "관리자2", 36));
		System.out.println(s.size());
		
		
	} // main

} // class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person{
	String id;  //  식별자
	String name;
	int age;
	
	// id 값을 hashcode로 지정해서 id값이 같으면 같은 객체로 구별 - id값으로 중복처리
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return p.id.equals(this.id);
		}
		return false;
	}
}