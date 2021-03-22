package static_basic;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1. 계산기 2개를 만들고 각각색상을 지정.
		 * 2. 계산기 생상을 확인하세요.
		 * 3. result값을 반환받는 getResult() 생성하세요.
		 * 4. pi와 circle()메서드를 이용해서 원의 넓이를 구하세요.
		 *
		 */
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		
		c1.setColor("red");
		c2.setColor("blue");
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
	
		c1.add(10);
		c1.add(20);
		System.out.println(c1.getResult());
		
		System.out.println(c1.areaircle(10));
		System.out.println(c1.pi*10*10);
		
		int[] arr = {1,2,3};
		System.out.println(Arrays.toString(arr));	
	}
}
