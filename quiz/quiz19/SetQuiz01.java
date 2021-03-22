package quiz19;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1.random객체를 이용해서 1~45까지 랜덤정수를 만들고
		 * 2.set계열을 이용해서 중복되지않은 로또 번호를 만들어내는 코드를 작성.
		 */
		TreeSet<Integer> set = new TreeSet<>();
		while(set.size()<7) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println(set.toString());
	}
}
