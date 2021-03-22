package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		//set계열은 순서 x , 값의 중복 x;
		//HashSet<String> set = new HashSet<>(); > 가능
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("Jsp");
		set.add("Spring");
		set.add("Oracle");
		set.add("Java");
		
		//set.size
		System.out.println("크기" + set.size());
		System.out.println(set.toString());
		
		//set에 들어있는 객체를 검색하려면, 박복자르 통해서 하나씩 순서대로 확인
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()) {//있으면 T없으면 F
			System.out.println(iter.next());
		}
		//set의 포함여부
		if(set.contains("Java")) {
			System.out.println("TTrue");
		} else {
			System.out.println("FFalse");
		}
		//삭제 > remove(value)
		set.remove("Oracle");
		System.out.println(set.toString());
		
		
		
	}
}
