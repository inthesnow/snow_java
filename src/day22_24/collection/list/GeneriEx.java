package day22_24.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GeneriEx {
	public static void main(String[] args) {
		/*
		 * 리스트를 매개 변수나, 반환 타입으로 사용할 때 쓸 수 있는 문법
		 * List<?> > 무엇이든 다들어 갈 수 있다.
		 * List<? extends String> > String을 포함한 자식클래스는 전달가능
		 * List<> super Integer> > Intger의 형태를 가질 수 있다면 전달가능
		 * ? > 와일드 카드 뭐든 다됨
		 */
		List<String> list = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Object> list3  = new ArrayList<Object>();
	
		add(list);
		add(list2);
		add(list3); // 쌉가능
	
		add2(list); //가
//		add2(list2);//불
//		add2(list3);//불
		
//		add3(list); //불
		add3(list2);//가
		add3(list3);//가
	}
	//리스트를 전달받는 메서드(함수)
	public static void add(List<?> list) {	}
	public static void add2(List<? extends String> list) {	}
	public static void add3(List<? super Integer> list) {	}
	
	//리스트를 반환받는 메서드
	public static List<String> return01() {
		
		
		return null;
	}
}
