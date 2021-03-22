package day11;

public class PenMain {
	public static void main(String[] args) {
		//Pen의 기능, 속성을 사용하려면 설계용클래스를 생성하야합니다.
		Pen black = new Pen();
		
		black.ink="검정";
		black.price=1000;
		black.company="모나미";
		
		black.write();
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 1200;
		red.company = "하이테크";
		
		red.write();
		
		black.info();
		red.info();
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(black.price));
		System.out.println(cal.add(red.price));
	}
}
