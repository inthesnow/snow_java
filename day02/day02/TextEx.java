package day02;

public class TextEx {
	public static void main(String[] args) {
		
		//단일문자형
		char  c1 = 'A', c2 = 65;
		
		System.out.println(c1);
		System.out.println(c2);
	
		char  c3 = '가', c4 = 44032, c5 = '\uAC00';
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		String s1 = "Hello ";
		String s2 = "World!";
		
		System.out.println(s1 +s2);
		System.out.println("문자열의 길이 : " + s1.length());//s.length : 문자열의 길이
		
		//문자열의 연산
		System.out.println( 100 + 200 ); //정수의 합
		System.out.println( "100" + 200 ); //문자열과 정수
		System.out.println( 100 + 200 + "Hello" ); //정수의 합 + 문자열
		System.out.println("hello" + 100 + 200 );// 문자열들
		System.out.println( 'A' + 10 );//75
		System.out.println( "A" + 10 );//A10
	}
}
