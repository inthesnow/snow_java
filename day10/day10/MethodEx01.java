package day10;


public class MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 1. 메서드(함수)는 메서드 내부에 선언할 수 없습니다.
		 * 2. 메서드는 만드는 과정과 사용하는 과정(호출)과정이 있습니다.
		 */

		int result = calSum();
		String str = strPuls(); 
		System.out.println("1~10까지의 합" + result );
		System.out.println("A부터 Z까" + str );
		System.out.println("가위바위보 : " + randomStr() );
	}
	

	static int calSum() {
		int sum = 0;
		for(int i =1; i <=10; i++) {
			sum+=i;
		}
		return sum;
	}

	static String strPuls() {
		String str = "";
		for(char c='A';c<='Z';c++) {
			str +=c;
		}
		return str;
	}

	static String randomStr() {
		
		double d = Math.random();
		
		String s = "";
		if(d<=0.3) {
			s="가위";
		} else if(d<=0.6) {
			s="바위";
		} else {
			s="보";
		}
		return s;
	}
}
