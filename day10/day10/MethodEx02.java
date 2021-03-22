package day10;

public class MethodEx02 {
	public static void main(String[] args) {
		/*
		 * 매개변수
		 * 1. 매개변수는 메서드 호출시 실행에 필요한 값을 전달하는 매개체
		 * 2. 매개변수는 몇개를 받을지 메서드 선언할 때 결정
		 * 3. 매겨변수를 여러개 받을때는 , 로 연결
		 * 4. 매개변수가 없다면 ()를 비워둔다.
		 */
		calSum(10);
		System.out.println(calSum(10));
		System.out.println(calSum2(10,20));
		System.out.println(calSum3(1,4,"가"));
	
	
	}
	
	static int calSum(int end) {
		int sum = 0;
		
		for(int i=1; i<=end;i++) {
			sum+=i;
		}
		
		return sum;

	}
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start; i <=end;i++) {
			sum+=i;
		}
		return sum;
	}
	//정수 2개, 문자열 1개를 매겨변수로 전달받는 calSum3()
	//기능 - 두정수사이의 차만큼 문자열을 붙인 결과를 반환

	static String calSum3(int num1, int num2, String word) {
		int sum = 0;
		if(num1>num2) {
			sum=num1-num2;
		} else {
			sum=num2-num1;
		}
		String str = "";
		for(int i=1;i<sum;i++ ) {
			str+=word;
		}
		
		return str;
	}
}
