package days19;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author dewbuster
 * @date 2024. 7. 25.-오전 11:10:39
 * @subject					C
 * @content			List		Set				||| 	Map
 * 					1) ArrayList
 * 					2) [Vector 컬렉션 클래스]
 * 						차이점 : 멀티스레드에 안전(동기화 처리 O)
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		Vector vt = new Vector();
		vt.addElement("김재민");
		vt.addElement("전재윤");
		vt.addElement("김선우");
		vt.addElement("최사랑");
		vt.addElement("김선우");
		vt.addElement(null);
		System.out.println(vt);
		
		System.out.println("=".repeat(30));
		ListIterator ir =  vt.listIterator();  // 양방향 listIterator
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		System.out.println("-".repeat(30));
		while (ir.hasPrevious()) {
			String name = (String) ir.previous();
			System.out.println(name);
		}
	}
}
