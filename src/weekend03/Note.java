package weekend03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Note {

	public static void main(String[] args) {
		// Creating an integer array
        int[] arr = { 1, 2, 3, 4, 5 };
 
        // --------- Using Arrays.stream() ---------
        
        // to convert int array into Stream
        IntStream intStream = Arrays.stream(arr);
        
        // Displaying elements in Stream
        intStream.forEach(str -> System.out.print(str + " "));
 
        // --------- Using Stream.of() ---------
 
        // to convert int array into Stream
        Stream<int[]> stream = Stream.of(arr);
 
        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));

	}
	/*
	 * Stream<arr의타입> stream = Array.stream(arr); -> 배열 요소를 순차 스트림 가져옴
	 * 
	 * Stream stream = Stream.of("Geek", "for", "Geeks");
	 * 
	 * 이 두 가지 방법은 지정된 배열에서 순차 스트림을 만드는 데 가장 일반적으로 사용
	 * 이 두 가지 모두 T로 호출될 때 Stream<T>를 반환합니다.
	 * 
	 * Arrays.stream()과 Stream.of()의 차이점
	 * 1. 다른 반환 유형 : 기본 배열(int[], long[] 등)의 경우 Arrays.stream()과 
	 * Stream.of()는 다른 반환 유형을 갖습니다. 
	 * 예: 정수 배열을 전달하는 경우 Stream.of() 메서드는 Stream을 반환하는 반면 
	 * Arrays.stream()은 IntStream을 반환합니다. 
	 * 
	 * Stream.of()는 플래트닝이 필요하지만 Arrays.stream()은 필요하지 않습니다 . 
	 * 원시 유형의 스트림을 처리하는 데 사용되는 이상적인 클래스는 
	 * 원시 스트림 유형(IntStream, LongStream 등)입니다. 
	 * 따라서 Stream.of()는 소비하기 전에 명시적으로 원시 스트림으로 플래트닝해야 합니다.
	 * 
	 * 1. Stream.of()는 제네릭인 반면 Arrays.stream은 제네릭이 아닙니다
    
     * Arrays.stream() 메서드는 int[], long[], double[] 유형의 기본 배열에만 작동하며 
     * 각각 IntStream, LongStream, DoubleStream을 반환합니다. 
     * 다른 기본 유형의 경우 Arrays.stream()은 작동하지 않습니다. 
     * 반면 Stream.of()는 T(Stream) 유형의 제네릭 Stream을 반환합니다. 
     * 따라서 모든 유형과 함께 사용할 수 있습니다.
     * 
     * 
     * 
	 */

}
