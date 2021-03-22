package static_init;

public class Computer {
	static String model = "gram-gram";
	static String compony = "LG";
	int price = 100000;
	
	//일반 맴버변수는 생성자에서 초기화
	Computer(){
		
	}
	//특징 - 클래스가 호출될 때 단 한번 실행됨(static변수의 초기화)
	static {
		System.out.println("static 초기화가 실행됨");
		model = "gram";
		compony = "Lg";
	}
}
