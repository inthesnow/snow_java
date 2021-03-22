package collection.list;

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
		//전체삭제
		list.clear();
		
		//peek, pop, push > 스택처럼 동작 -LIFO. last in first out
		list.push("kang");//배열의 처음에 추가 but 스택의 마지막에 추가
		list.push("lee");
		list.push("park");
		System.out.println(list.toString());

		System.out.println(list.pop());//마지막에 삽인된  값을 삭제하고 읽기
		System.out.println(list.toString());
		System.out.println(list.peek());//마지막에 삽입된 값을 삭제하지 않고 읽기.
		System.out.println(list.toString());
	
		//offer, poll ,peek > queue처럼 동작 - FIFO. first in first out
		list.clear();
		System.out.println(list.toString());
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());
		list.poll();//배열의 가장 앞에 삽임된, 큐의 가장 앞에
		System.out.println(list.toString());
		System.out.println(list.peek());
		System.out.println(list.toString());
		
		
		
	}
}
