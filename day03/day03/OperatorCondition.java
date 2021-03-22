package day03;

import day01.SystemOut;

public class OperatorCondition {
	public static void main(String[] args) {
		/*
		* 어떤 수의 검증을 위해서 랜덤한 값을 주는 메소드
		* = Math.random()
		*/
		
		System.out.println( Math.random() );
		
		double d = Math.random() * 10;// 0.0 ~ 9.9
		int r = (int)d + 1; // 1 ~ 10

		System.out.println(r);
		
		int s = (int)(Math.random() *10) +1;
		// Math.random의 정수형은 0만 나온다. 미리 10을 곱해 정수 값을 만들어준다.
		
		System.out.println(s);
		
		//삼항 연산식 : (조건 ? 연산1 : 연산2) > 조건이 참일때 연산1 거짓일때 연산2
		String result = r % 2 ==0 ? "짝수~" : "홀수~";
		System.out.println(result);
		
		System.out.println(r % 2 ==0 ? "짝수~" : "홀수~");
	}
}
