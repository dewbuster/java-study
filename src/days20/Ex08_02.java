package days20;

import days13.Person;

public class Ex08_02 {

	public static void main(String[] args) {
		/*
		 * 1. 제네릭 타입은 클래스, 메서드에 선언할 수 있다.
		 * 		1) 제네릭 클래스 
		 * 		2) 제네릭 메서드
		 */
		/*
		Box b1 = new Box();
		b1.setItem(100);
		System.out.println(b1.getItem());
		*/
		// Box 원시 타입( Raw Type )    // T 타입변수, 타입매개변수
		Box<Person> b1 = new Box<>();
		b1.setItem(new Person());
		Person p = b1.getItem();
		
	} // main

} // class

class Box <T>{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}