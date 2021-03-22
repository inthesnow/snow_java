package Quiz;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		/* 
		 * 두 정수를 입력 받습니다.
		 * 두 수의 크기는 정해지지 않았습니다.
		 * 두 수 사이의 합을 구하는 프로그램을 작성.
		*/
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 > ");
		int a = s.nextInt();
		System.out.print("정수를 입력해주세요 > ");
		int b = s.nextInt();
		
		int sum = 0;
		
//		if(a>b) {
//			for(int i = b ; i <= a ; i++) {
//				sum +=i;
//			}
//		} else if(a == b) {
//				sum = a+b;	
//		} else {
//			for(int i = a ; i <= b ;i++) {
//				sum += i;	
//			}
//		}

		for (int i = (a>b ? b : a); i <= (a>b ? a : b); i++ ) {
			if(a==b) {
				sum = a+b;
			}
			sum += i;
		}
		
		System.out.println(sum);

	
	
	}
}
