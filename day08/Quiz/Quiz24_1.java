package Quiz;

import java.util.Scanner;

public class Quiz24_1 {
	public static void main(String[] args) {
		
		//1. 두수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램입니다.
		//2. 2가지 정수를 1~100사이의 난수를 발생시켜 지속적 문제 출제.
		//3. 정답과 오답의 횟수를 카운터, 0을입력받으면 탈출
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		while(true) {
			int x = (int)(Math.random()*100+1);
			int y = (int)(Math.random()*100+1);
			int z = (int)(Math.random()*2);
			int r = 0;

			if(z==0) {
				r= x+y;
			} else {
				r= x-y;
			}
			
			System.out.print(z==0 ? x+" + "+y+" = " : x+" - "+y+" = ");
			int a = s.nextInt();
			
			if (a==0) {
				System.out.println("정답횟수 : " + i);
				System.out.println("오답횟수 : " + j);
				break;
			}
	
			else if(a==r) {
				System.out.println("정답입니다!");
				i++;
			} else {
				System.out.println("틀렸는데요?");
				j++;
			}
		}	
	}
}
