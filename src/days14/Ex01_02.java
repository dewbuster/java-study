package days14;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01_02 {

	public static void main(String[] args) {

		//6. [취업 문제] ego(자아)
		String n = "keNik";
		String m = "kKnie";
		//IntStream
		n.toUpperCase()
		.chars()
		.sorted()
		.collect(StringBuilder :: new
				, StringBuilder :: appendCodePoint
				, StringBuilder :: append);
		m = Stream.of(m.toUpperCase().split(""))
		.sorted()
		.collect( Collectors.joining());
		
		String[] arr = new String[]{"b", "a", "c"};
		m = Arrays.stream(arr).sorted().collect( Collectors.joining());
		System.out.println(m);
		
		/*
		 * 1. 스트림 만들기
		배열 스트림 : Arrays.stream()
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		컬렉션 스트림: .stream()
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stream = list.stream();
		Stream.builder()
		Stream<String> builderStream = Stream.<String>builder()
		    .add("a").add("b").add("c")
		    .build(); 
		람다식 Stream.generate(), iterate()
		Stream<String> generatedStream = Stream.generate(()->"a").limit(3);
		// 생성할 때 스트림의 크기가 정해져있지 않기(무한하기)때문에 최대 크기를 제한해줘야 한다.
		
		Stream<Integer> iteratedStream = Stream.iterate(0, n->n+2).limit(5); //0,2,4,6,8
		기본 타입형 스트림
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		병렬 스트림: parallelStream()
		Stream<String> parallelStream = list.parallelStream();
		 * 
		 * 
		 */
		

	}
}
