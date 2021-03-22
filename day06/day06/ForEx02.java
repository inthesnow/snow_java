package day06;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수입력 > ");
		int num = s.nextInt();
		
		int count = 0;
		for(int i = 1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		System.out.println(num+"에 약수의 개수 : "+count);
		System.out.println(count==2?num+"은 소수":num+"은 소수가 아닙니다.");
		
	}
}
