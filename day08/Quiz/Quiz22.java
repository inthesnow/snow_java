package Quiz;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		//과제
		//소수 > 나누어 떨어지는 수가 1과 자기 자신인 수
		//ex) 입력 10, 소수(2,3,5,7)의 합 17.
		//임의의 정수를 받아 1부터 정수 사이의 소수들의 합.
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수 > ");
		int num = s.nextInt();
		int count = 0;
		
		int sum = 0;
		for(int i = 2; i <= num; i++) {
			count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count==2) sum+=i;
		}
		System.out.println(sum);
	}
}
