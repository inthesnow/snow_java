package Quiz07;

import java.util.Scanner;

public class SonicAp extends Airplane {
	/*
	 * 부모클래스는 건들지 않습니다.
	 * 
	 * 1. flyMode int형 맴버변수 선언
	 * 2. 생성자는 name을 저장할 수 있도록 처리.
	 * 3. fly()메서드를 오버라이딩한다.
	 * 	-기능 - flyMode가 1이면 "고속모드비행"
	 * 		   flyMode가 0이면 super를 통해 부모님의 메서드를 호출
	 */
	SonicAp(String name) {
		super(name);
	}
	
	int flyMode;
	
	void fly() {
		
		if(this.flyMode==1) {
			System.out.println("고속모드로 비행합니다");
		} else {
			super.fly();
		}
	}
}
