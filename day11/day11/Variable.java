package day11;

public class Variable {
	//멤버 변수 : 초기화 하지않으면 기본값으로 자동 초기화
	int a;
	
	void printNum(int c ) { //메게변수는 지역변수지만 초기화하지 않아도 사용가능
		int b = 0;//지역변수는 초기화 안할시 사용불가
		System.out.println("멤버변수" + a);
		System.out.println("지역변수" + b);
		System.out.println("매게변수" + c);
	}
	
}
