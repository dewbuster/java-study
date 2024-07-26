package days19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * List - AL, V, LL, S, LL(PQ,Q), PQ
		 * Set - HS, LHS, TS
		 * [ Map ]
		 * 1. key + value 한쌍 관리 Entry 
		 * 2. key 중복 x, value 중복 o
		 * 3. HashMap	(신) - 사용 권장
		 * 	  HashTable	(구) 
		 * 
		 * 4. 해싱(Hashing) ?
		 * 	- 해시함수를 사용하여 데이터를 해시 테이블에 저장하고 검색하는 기법
		 * 	- 해시함수?
		 * 		데이터를 저장한 곳을 알려주는 함수
		 * 		데이터를 빠르게 검색할 수 있다
		 * 		많은 양의 데이터를 검색할 때 성능이 뛰어남
		 */
		//		id		name
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("keni", "이창익");
		
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.printf("key = %s ,value = %s  ", key, val);
		}

		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>> ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String, String> entry = (Entry<String, String>) ir
					.next();
			System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
		}

		
		/*
		System.out.println(hm);
		System.out.println(hm.size());
		
		// 1. 모든 key 조회
		Set<String> keys = hm.keySet();
		Iterator<String> ir = keys.iterator();
		while (ir.hasNext()) {
			String key = (String) ir.next();
			System.out.printf("%s=%s\n", key ,hm.get(key));
		}
		
		// value
		Collection<String> values = hm.values();
		Iterator<String> ir2 = values.iterator();
		while (ir2.hasNext()) {
			String value = ir2.next();
			System.out.printf("%s\n", value);
		}
		*/
		
		
		
	} // main

}  // class
