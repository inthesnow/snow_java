package quiz18;

import java.util.List;
import java.util.ArrayList;

public class ArrayListQuiz01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list에 1~20까지 정수를 저장
		int i = 1;
		while(i<21) {
			list.add(i);
			i++;
		}
		//저장한 값을 반복문으로 출력
		for(int j:list) {
			System.out.print(j +" ");
		}

		
	}
}
