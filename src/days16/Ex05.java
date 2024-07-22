package days16;
/**
 * @author dewbuster
 * @date 2024. 7. 22.-오후 2:22:28
 * @subject [문자열 다루는 클래스]
 * @content 1. String
 * 			2. StringBuffer
 * 			3. StringBuilder
 * 			4. StringTokenizer
 */
public class Ex05 {

	public static void main(String[] args) {
		String name = "홍길동";
		name += "님";       // + 문자열 연결 연산자
		name += " 안녕!!!";
		
		System.out.println(name);
		
		// == 두 문자 비교는 equals(), equalsIgnoreCase();
		System.out.println( name.length() );
		System.out.println( name.charAt(0) );
		System.out.println(name.substring(1, 3));
		System.out.println(name.substring(3));
		System.out.println(name.trim());
		// System.out.println( name.split(regex) );
		// 클래스 메서드(정적, static)
		String msg = String.format("%s님 %d살", name, 20);
		System.out.println(msg);
		System.out.println("aBc".compareTo("abc"));
		// name 문자열 속에 "길동" 이라는 문자열 포함 유무
		System.out.println(name.contains("길동"));
		System.out.println(name.contains("시훈")); // false
		
		System.out.println(name.indexOf("길동")); // 인덱스 1번쨰
		System.out.println(name.indexOf("시훈")); //  -1
		
		System.out.println(name.lastIndexOf("길동")); // 끝에서부터 찾아 인덱스값 반환
		
	}

}
