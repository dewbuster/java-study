package days17;

import java.io.IOException;
import java.util.Objects;

import days12.Point;

public class Ex05 {

	public static void main(String[] args) {
		// Arrays 클래스 : toString(), sort(), binarySearch()
		// Objects 클래스 : 모든 메서드 static
		//					Objects.메서드()
		//					객체의 비교 또는 널 체크할 때 유용
		Point p1 = null;
		if (Objects.isNull(p1)) {
			
		}
		
		if (p1 != null) {
			
		}
		
		if (Objects.nonNull(p1)) {
			
		}
		
		if ( p1 == null ) {
			new IOException("예외 메시지");
		}
		Point pCopy = p1;
		//
		Point pCopy2 = Objects.requireNonNull(p1, "예외 메시지");
		
		if ( p1 != null && p1.equals(pCopy)) {
		}
		//
		if (Objects.equals(p1, pCopy)) {
			// p1 널체크도 하고 pCopy와 같은지 비교
		}
		
	} // main

} // class
