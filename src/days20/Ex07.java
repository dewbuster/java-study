package days20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author dewbuster
 * @date 2024. 7. 26.-오후 2:13:08
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [ 익명 클래스 == 무명 클래스 == Anonymous 클래스]
		 * 1. 이름이 없는 클래스
		 * 2. 선언 형식
		 * new 부모클래스명(매개변수...) { 
		 * 		@Override
		 * 		부모메서드(){ }
		 * 			:
		 * }
		 * new 부모인터페이스(){
		 * 		@Override
		 * 		부모메서드(){ }
		 * 			:
		 * } 
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3, 5, 2, 4, 1);
		System.out.println(list);
		// 내림차순 정렬 -> 출력
		/*
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		*/
		list.sort((o1, o2) -> o2.compareTo(o1));
		//list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}
}

/*
class ListComparator implements Comparator<Integer>{

   @Override
   public int compare(Integer o1, Integer o2) {
      return o2.compareTo(o1); // 0 양수 음수
   }

}
*/

