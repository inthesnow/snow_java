package day05;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		
		//입력받은 값까지의 짝수의 갯수 확인
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		int num = s.nextInt();
		
		int a = 1;
		int r=0;
		while( a <= num ) {
			if(a%2==0) {
				r +=1;
			}
			a++;
		}
		System.out.println(num+"까지의 짝수의 갯수는 : "+r);
		s.close();
	}
}
