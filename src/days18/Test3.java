package days18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Test3 {

	public static void main(String[] args) {

		ArrayList members = new ArrayList();
		members.add("김준석");
		members.add("원충희");
		members.add("박준용");
		members.add("최사랑");
		members.add("이시훈");
		
		
		System.out.printf("팀원 인원수: %s\n", members.size());
		System.out.println(members.get(1));
		members.set(1, "홍길동");
		
		if (members.contains("홍길동")) {
			members.remove("홍길동");
		}
		
		members.removeIf(new Predicate<String> () {

			@Override
			public boolean test(String t) {
				
				return t.startsWith("이");
			}
			
		});
		
		Iterator ir = members.iterator();
		while (ir.hasNext()) {
			String s = (String) ir.next();
			System.out.println(s);
		}

	}

}
