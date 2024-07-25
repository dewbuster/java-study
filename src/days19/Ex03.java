package days19;
/**
 * @author dewbuster
 * @date 2024. 7. 25.-오전 11:45:37
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [LinkedList] 컬렉션 클래스
		//	고리(뒷요소의 주소) 연결된 + List
		// 단방향 링크드리스트 + 환형
		// 양방향 링크드리스트 + 환형
		
		// 1)배열 : 읽기 성능 빠르다.
		// 			배열크기X 삽입, 삭제 속도느림
		// 2)링크드리스트 : 비연속적 삽입 삭제 성능 좋다
		Node node1 = new Node();
		node1.value = 10;

		Node node2 = new Node();
		node2.value = 20;
		
		node1.next = node2;
		
		Node node3 = new Node();
		node3.value = 30;
		
		node2.next = node3;
		
		Node node4 = new Node();
		node4.value = 40;

		node3.next = node4;

		Node node5 = new Node();
		node5.value = 50;
		
		node4.next = node5;
		
		// node1 시작노드로 부터 모든 노드의 value 출력
		Node node = node1;
		
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}

		
		
	} // main

} // class

class Node{
	int value; // 값
	// 다음 노드의 주소
	Node next = null;
	Node prev = null;  // 양방향
}
