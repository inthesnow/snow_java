package day26.ramda.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamEx {
	public static void main(String[] args) {
		/*
		 * 반복자 스트림이란?
		 * -컬랙션의 값을 조금더 빠르고 간결하게 사용할 수 있도록 제공
		 * -반복자 스트림은 함수적 인터페이스를 받고 있기 떄문에 람다식을 제공
		 */
		String[] arr = {"hong", "lee", "park", "kim", "kang"};
		List<String> list = Arrays.asList(arr);
		Stream<String> stream = list.stream();
		
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t);
			}
		});
		System.out.println("\n");
		list.stream().forEach((t) -> System.out.print(t));
	}
}
