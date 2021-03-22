package day05;

import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		
		//어떤 값에 대한 검증, (조건형태가 여러가지 일 수 있다.)
		//입력받은 수가 소수 인지 아닌지, 검증
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("소수인지 판별할 정수를 입력 > ");
		int n = s.nextInt();
		int a=2;
		
		while( n%a !=0 ) {			
			a++;
		}
		System.out.println(n==a ? n+"은 소수이다" : n+"은 소수가 아니다.");
		
	}
}
