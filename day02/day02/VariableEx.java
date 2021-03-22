package day02;

public class VariableEx {
	public static void main(String[] args) {
		//선언
		int num;
		//초기화
		num = 10;
		
		System.out.println(num);

		//선언과 초기화를 동시에
		int num1 = 11;
		//초기화된 변수를 변경
		num1 = 100;
		//변수를 활용하여 또다른 변수를 초기화
		int result = num +num1;
		System.out.println(result);
		
		//Q1. 변수명 result2, result의 값과 10을 더한 결과를 저장
		int result2 = result + 10;
		System.out.println(result2);

		//String : 문자열을 저장하는 변수타입(문자열을 저장하는 클래스)
		String a = "홍길동";
		System.out.println(a + result2);
				
	}
}
