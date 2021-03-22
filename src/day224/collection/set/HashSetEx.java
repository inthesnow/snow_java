package day224.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//set계열은 순서 x, 중복 x
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//set에 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		//set에 저장된 크기 size()
		System.out.println("크기:" + set.size());
		
		System.out.println(set.toString());
		
		//set에 들어있는 객체를 검색하려면, 반복자 통해서 하나씩 순서대로 확인합니다.
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext() ) { //다음이 있다면 t, 없다면 f
			System.out.println(iter.next());
		}
		
		//set에 검색(포함여부) - contains()
		
		if(set.contains("JAVA" ) ) {
			System.out.println("JAVA가 포함되어 있음");
		}
		
		//set에 삭제 remove(값)
		set.remove("ORACLE");
		System.out.println(set.toString());
		
		
		
		
		
		
		
	}
}
