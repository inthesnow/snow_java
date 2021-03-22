package day05;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String[] args) {
		
		//10번 숫자를 입력받고, 입력 받은 값들의 합.
		Scanner s = new Scanner(System.in);

		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			System.out.print("정수를 입력해주세요 > ");
			int n = s.nextInt();
			
			sum += n;
			i++;
		}
		System.out.println("10개의 정수의 합은 : " + sum + "입니다." );
	}
}
