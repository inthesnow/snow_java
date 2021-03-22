package exception_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 * 1. 입력한 값이 숫자가 아니라면 "반드시 숫자만 입력하세요"를 출력한 뒤에 다시 입력
		 * 2. 입력한 값이 1에서 100까지의 값이 아니라면 예외처리 구문으로 이동하고 다시입력받도록 처리.(단, 카운트는 증가) 
		 */
		
		//updwon
		Scanner s= new Scanner(System.in);
		int x = (int)(Math.random()*100)+1;
		int count=0;
		System.out.println("1과 100사이의 값을 입력하세요");
		
		while(true) {
			System.out.print("> ");
			String a = s.next();
			count++;
			try {
				int i = Integer.parseInt(a);
				if(i>100||i<1) {
					throw new Exception("1~100사이의 숫자를 입력해주세요");
				}
				if(x>i) {
					System.out.println("더 큰수를 입력하세요");
				} else if(x<i) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다.");
					System.out.println("시도 횟수 : " +count);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("반드시 정수를 입력하세요");
			} catch (Exception e) {
				e.getMessage();
			}
		}
	}
	
}
