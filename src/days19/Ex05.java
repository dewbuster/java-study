package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author dewbuster
 * @date 2024. 7. 25.-오후 12:36:27
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// 큐(Queue) 구조  FIFO
		// offer(),    poll() / peek()
		//
		// 더블 큐 (Deque) 구조
//		Queue q = new LinkedList();
		Deque q = new LinkedList();
		q.offer("전재윤");
		q.offer("김재민");
		q.offer("김준석");
		q.offer("박준용");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		// Deque
//		q.offerFirst("d");
//		q.offerLast("d");
//		q.pollFirst();
//		q.pollLast()
	}

}
