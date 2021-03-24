package day26_27.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 * 반복자 스트림은 
		 * 중간 처리 메서드 - 처리결과를 Stream형태로 반환함
		 * 최종 처리 메서드 - 처리결과를 정수나, 실수등으로 반환함
		 * 람다를 적용하는 함수적 인터페이스 종류
		 * consumer - 매개변수를 받고, 반환은 없는 유형
		 * predicate - 매개변수를 받고, 반환은 boolean타입
		 * function - 매개변수를 받고, 반환유형은 임의로 결정
		 */
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<=10;i++) {
			/*
			Random ran = new Random();
			int num =ran.nextInt(100)+1;
			list.add(num);
			*/
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println(list.toString());
		//distinct - 중복을 제거하는 중간 처리 메서드
		list.stream().distinct().forEach((a)->System.out.print(a+" "));
		System.out.println();
		//sorted - 정렬
		list.stream().distinct().sorted().forEach((a)->System.out.print(a+" "));
		System.out.println();
		//filter - 걸러내는 기능 - boolean형 타입의 true인 애들만 반환
		list.stream().distinct().sorted().filter((a)->a%2==0).forEach((a)->System.out.print(a+" "));
		System.out.println();
		//map - 람다에 정의된 새로운 Stream으로 반환
		list.parallelStream().map( (a)-> a%2==0?"짝":"홀")
		.forEach((a)->System.out.print(a+" "));
		System.out.println();
		list.parallelStream().map( (a)-> a>=50?a:0)
		.forEach((a)->System.out.print(a+" "));
		System.out.println();
		//최종처리 메서드 collect
		List<Integer> newList=list.stream().filter((a)->a>=50&&a%3==0).collect(Collectors.toList());
		System.out.println("collect"+newList.toString());
		
		//maptodouble, maptoint
		long r1=list.stream().mapToInt((a)->a).count();
		System.out.println("갯수"+r1);
		int r2 =list.stream().mapToInt((a)->a).sum();
		System.out.println("sum : "+r2);
		
		OptionalInt r3=list.stream().mapToInt((a)->a).max();
		System.out.println("가장큰값 : "+r3.getAsInt());
		
		Double r4 =list.stream().mapToInt((a)->a).average().getAsDouble();
		System.out.println("평군 : "+r4);
		
		
		
	}
}
