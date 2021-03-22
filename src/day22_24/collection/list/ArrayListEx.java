package day22_24.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		//List = 순서(index), 중복 을 허용합니다.
		
		//ArrayList생성
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		//리스트 추가
		list.add("JAVA");
		list.add("Jsp");
		list.add("DB");
		list.add("Spring");
		list.add("JAVA");
		//리스트 사이즈확인
		System.out.println("리스트 크키 : " + list.size());
		//리스트에 저장된 값을 문자열로 확인 toString()
		System.out.println(list.toString());
		
		//리스트 중간에 추가 add(index, 값)
		list.add(3,"Oracle");
		System.out.println(list.toString());
		
		//list값의 수정 set(index, value)
		list.set(3, "MySQL");
		System.out.println(list.toString());
		
		//list의 값 얻기get(index)
		System.out.println("list fourth index : "+list.get(0));
		
		//list의 값의 포함 여부 contains()
		if(list.contains("JAVA")) {
			System.out.println("yes");
		}
		
		//list의 값 삭제 remove(value), remove(index)
		list.remove("Jsp");
		list.remove(3);
		System.out.println(list.toString());
		
		//list 삭제 clear();
		list.clear();
		System.out.println(list.toString());
		
		//addAll 리스트와 리스트를 병합
		List<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		list2.add("이순신");
		
		list.addAll(list2);
		System.out.println(list.toString());
		
		//배열을 리스트로 바꾸는 방법.
		String[] arr = {"park", "lee"};
		List<String> list3 = Arrays.asList(arr);
		
	}
}
