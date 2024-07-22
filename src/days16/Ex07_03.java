package days16;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex07_03 {

	public static void main(String[] args) {
		/*
	      문제 설명

	      길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는
	      문자열을 리턴하는 함수, solution을 완성하세요. 
	      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 
	      리턴하면 됩니다.

	      제한 조건
	      n은 길이 10,000이하인 자연수입니다.
	      입출력 예
	      n   return
	      3   "수박수"
	      4   "수박수박"
		 */
		int n = 50;
		System.out.println(solution(n));
		System.out.println(solution2(n));
	}
	
	private static String solution(int n) {
		long start = System.currentTimeMillis();
		try {
			StringBuilder s = new StringBuilder();
			for (int i = 0; i < n; i++) {
				s.append(i % 2 == 0 ? "수" : "박");
			}
			String answer = s.toString();
			
			return answer;
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(finish - start + "ms");
		}
	}
	
	
	private static String solution2(int n) {
		long start = System.currentTimeMillis();
		try {
			return IntStream.range(0, n).mapToObj(i->i%2==0?"수":"박").collect(Collectors.joining());
		} finally {
			long finish = System.currentTimeMillis();
			System.out.println(finish - start + "ms");
		}
	}

}
