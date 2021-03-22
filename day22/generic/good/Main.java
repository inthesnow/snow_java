package generic.good;

import modi.member.pac1.A;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * 제네릭을 사용시, 객체를 생성할 때 사용할 타입을 지정할 수 있고,
		 * 다양한 값을 저장하도록 생성해서 사용가능
		 */
		ABC<String> abc = new ABC<String>();
		abc.setT("name");//저장
		String name = abc.getT();//사용
		System.out.println(name);
		
		ABC<DEF> abc2 = new ABC<DEF>();
		abc2.setT(new DEF());
		DEF def = abc2.getT();
		
		//ABC<int> abc3 = new ABC<>(); // 제네릭은 기본형이 저장될 수 없고 생성자의 타입은 생략가능
	}
}
