package days19;

import java.util.Stack;

/**
 * @author dewbuster
 * @date 2024. 7. 25.-오후 12:21:50
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
		 * [스택(Stack) 구조]
		 *  스택:LIFO	push(), pop(), empty(), search()
		 *  					peek()
		 */
		// Stack은 Vector 상속 받아 add 등 Vector 메서드 있으나, 
		// push, pop, peek, empty, search만 사용해야함.
		
		Stack s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
		//System.out.println(s.pop());
		//System.out.println(s.peek());
		//System.out.println(s.size());
		
		System.out.println(s.search("홍길동"));
		System.out.println(s.search("전재윤"));
		
		while (!s.empty()) {
			System.out.println(s.pop());
		}
		

	}

}
