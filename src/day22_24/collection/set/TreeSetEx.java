package day22_24.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//중복x, 순서x, 오름차순정렬 
		TreeSet<String> set = new TreeSet<>();
		
		set.add("망아지");
		set.add("송아지");
		set.add("강아지");
		set.add("하마");
		set.add("강아지");
		
		System.out.println(set.toString());
		
		
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(100);
		set2.add(34);
		set2.add(1);
		set2.add(50);
		System.out.println(set2.toString());
		
		
		
		
		
		
		
	}
}
