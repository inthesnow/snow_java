package day22_24.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx {
	public static void main(String[] args) {
		//List<String> list = new LinkedList<>();
		//Queue<String> list = new LinkedList<>();
		LinkedList<String> list = new LinkedList<>();
		
		list.add("hong");
		list.add("lee");
		list.add("hong2");
		//처음에 추가
		list.addFirst("park");
		System.out.println(list.toString());
		//마지막에 추가
		list.addLast("shin");
		System.out.println(list.toString());
		//peek, poll, push
		list.push("kang");//마지막에 추가
		System.out.println(list.toString());

		System.out.println(list.pop());//마지막에 삽인된  값을 삭제하고 읽기
		System.out.println(list.toString());
		System.out.println(list.peek());//마지막에 삽입된 값을 삭제하지 않고 읽기.
		System.out.println(list.toString());
	
	}
}
