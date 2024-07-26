package days20;

import java.util.ArrayList;

public class Ex08_05 {

	public static void main(String[] args) {
		/* [제한된 제네릭 클래스]
		 * <T extends Fruit> 의미 이해
		 * <T extends Fruit & eatable> 의미 이해
		 */
		
		/*
		//Box4<Toy> toybox = new Box4<>();
		//Box4<빵> 빵box = new Box4<>();
		Box4<Apple> applebox = new Box4<>();
		Box4<Grape> grapebox = new Box4<>();
		*/
		
		
		
	} // main

} // class

/*
// 제네릭 클래스
//class Box4<T extends Fruit>{
class Box4<T extends Fruit & eatable>{
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) { this.list.add(item); }

	int size() { return this.list.size(); }

	T get(int i) { return this.list.get(i); }

	public String toString() { return  this.list.toString();  }  
}

// 먹을 수 있는 음식..
interface eatable{
	
}

class 빵 implements eatable{
	
}

class Fruit extends Object implements eatable{
	   public String toString() {
	      return "Fruit";
	   }
	}
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}   
}
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}   
}

class Toy{
	public String toString() {
		return "Toy";
	}   
}
*/