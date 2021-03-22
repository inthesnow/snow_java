package day08;

import java.util.Scanner;

public class ContinueEx02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 > ");
		int num = s.nextInt();

		int count = 0;
		int sum = 0;

		ex:for(int i = 2; i <= num; i++) {
			count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
				if(count>2) continue ex;
			}
			if(count==2) sum+=i;
		}
		System.out.println(sum);
	}
}
