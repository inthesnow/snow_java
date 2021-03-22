package Quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		
		// 정수 3개를 입력받아 가장 큰 값, 중간 값, 작은 값 구분해서 출력
		// 단, 같은 수 인 경우는 고려 하지 않는다.
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력해 주세요.");
		System.out.print(">");
		int a = s.nextInt();
		System.out.print(">");
		int b = s.nextInt();
		System.out.print(">");
		int c= s.nextInt();
		
		if ( a > b ) {
			if (b > c ) {
				System.out.print(a+", "+b+", "+c);
			} else {
				System.out.println(a>c ? a+", "+c+ ", "+b : c+", " +a+", "+b);
				
			}
		} else {
			if ( a > c) {
				System.out.print(b+", "+a+", "+c);
			} else {
				System.out.print(b>c ? b+", "+c+", "+a : c+", "+b+", "+a);
			}
		}
		
	}
}
