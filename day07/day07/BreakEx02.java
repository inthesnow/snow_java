package day07;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		//문제를 보여주고, 정답을 맞출때까지 계속 입력을 받는 프로그램.
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.println("4x6=?");

			System.out.print("> ");
			int a = s.nextInt();
			
			if (a==24) {
				System.out.println("정답입니다.");
				break;	
			} else {
				System.out.println("다시 생각해보세요");
			}
		}
	}
}
