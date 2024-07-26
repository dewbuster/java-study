package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author dewbuster
 * @date 2024. 7. 26.-오후 12:03:40
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		// Collections 클래스
		// Collections.reverseOrder();
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(2);
//		list.add(4);
//		list.add(1);
		Collections.addAll(list, 3, 5, 2, 4, 1);
		System.out.println(list);
		Collections.rotate(list, 2); // 오른쪽으로 2칸 회전 -2면 왼쪽
		System.out.println(list);
		Collections.swap(list, 0, 3);
		System.out.println(list);
		Collections.shuffle(list);  // 임의의 자리 섞음.
		System.out.println(list);
		
		//Collections.sort(list);  // 오름차순 정렬
		//Collections.sort(list, Collections.reverseOrder());  // 내림차순
		Collections.sort(list, (o1,o2) -> o2-o1);   // 내림차순 람다
		System.out.println(list);
		
		Collections.fill(list, -1);
		System.out.println(list);
		
		
		
	}

}
