package day02;

public class IntegerEx {
	public static void main(String[] args) {
		
		//정수형타입
		byte a = 127, a1 = -128;
		short b = 32767, b1 = -32768;
		int c = 2147483647, c1 = -2147483648;
		long d = 2147483648L, d1 = -2147483649L;
		System.out.println(d + "\n");
		
		//2진수 or 8진수 or 16진수로 저장
		//2진수는 0b를 붙임
		int bin = 0b1010;
		System.out.println("이진수 1010의 값은 : " + bin + "입니다.");
		//8진수는 0을 붙임
		int octa = 064;
		System.out.println("8진수 064의 값은 : " + octa);
		//16진수는 0x를 붙임
		int hexa = 0x3a4c;
		System.out.println("16진수 0x3a4c의 값은" + hexa + "입니다");
		
		//실수형
		float f1 = 3.14f;
		double d2 = 3.14;
		
		//e표기법
		double d3 = 314e-2, d4 = 0.0314e2;
		System.out.println(f1 + d2 + d3 + d4);
		
		//논리형
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		
	}
}
