package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author dewbuster
 * @date 2024. 7. 25.-오후 2:02:50
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// PriorityQueue
		// 우선순위 큐		FIFO X
		// 우선순위가 높은 것부터 꺼내오는 큐
		// (작은 숫자가 우선 순위가 높다)
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		System.out.println( q );
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
	} // main

} // class
