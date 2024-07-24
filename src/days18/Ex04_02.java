package days18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class Ex04_02 {

	public static void main(String[] args) {
		// <E> 제네릭 클래스 Element == 요소
		ArrayList<String> list = new ArrayList<String>(3);
		list.add("이시훈");
		list.add("원충희");
		list.add("김준석");		
		System.out.println(list.size());
		System.out.println(list);
		list.add("송세호");
		System.out.println(list);
		System.out.println(list.contains("원충희"));
		list.add("원충희");
		System.out.println(list.indexOf("원충희"));
		System.out.println(list.lastIndexOf("원충희"));
		
		// list.clear(); 모든 요소 삭제
		list.set(1, "전재윤");
		System.out.println(list);
		//3 인덱스 값
		System.out.println(list.get(3));
		
		// 원충희를 찾아서 삭제..
		//int index = list.indexOf("원충희");
		//list.remove(index);
		/*
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				//
				return t.equals("원충희");
			}
		});
		*/
		//list.removeIf((String t) -> {return t.equals("원충희");});
		//list.removeIf(t -> t.equals("원충희"));
		//System.out.println(list);
		System.out.println(list.isEmpty());
		/*
		list.sort( new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
		} );
		*/
		list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);
		// list의 모든 요소를 출력
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		// iterator == 반복자
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}

	}

}
