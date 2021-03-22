package day03;

public class OperatorEx02 {
	public static void main(String[] args) {
		//2항 연산자
		//산술 연산자
		
		int i = 7 / 3; //2
		int j = 7 % 3; //1
		int k = 8 * 3; //24
		
		System.out.println( i == j);
		System.out.println( i != j);
		System.out.println( i >= j);
		System.out.println( i < j);
		System.out.println( k != 21 );
		System.out.println( k != 21 );
		System.out.println( k % 2 != 0  ); //홀짝 판단
		System.out.println( k % 2 == 0 ); // 2의 배수판단
		System.out.println( k % 6 == 0 ); //6의 배수 판단
		
		
		//비트 연산자 & | ^
		int a = 5, b = 3;
		
		System.out.println( a & b ); // & : 둘의 비트값이 1이어야 1
		System.out.println( a | b ); // | : 둘 중 하나라도 비트값이 1이면 1
		System.out.println( a ^ b ); // ^ : 둘의 비트값이 다르면 1, 같으면 0
		
		//비트 쉬프트 >>, << : 이진수를 기준으로 칸이동
		int h = 100;
		System.out.println( h >> 3 ); //0110 0100 >>3 0000 1100 == 12

	}
}
