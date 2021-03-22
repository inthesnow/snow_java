package quiz15;

import java.util.Scanner;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class MainClass02 {
	public static void main(String[] args) {

		//updwon
		Scanner s= new Scanner(System.in);
		int x = (int)(Math.random()*100)+1;
		int count=0;
		
		while(true) {
			System.out.println("1과 100사이의 값을 입력하세요");
			System.out.print("> ");
			String a = s.next();
			count++;
			try {
				int i = Integer.parseInt(a);
				if(x>i) {
					System.out.println("더 큰수를 입력하세요");
				} else if(x<i) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다.");
					System.out.println("시도 횟수 : " +count);
					break;
				}
			} catch (Exception e) {
				System.out.println("정수를 입력하세요");
			}
		}
	}
}
