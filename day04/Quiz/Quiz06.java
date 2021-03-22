package Quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		//스캐너를 이용해 정수하나를 받아 입력받은 정수가 음수, 0, 홀, 짝 을 구분하는 조건문
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 > ");
		int x = s.nextInt();
		
		if (x > 0) {
			if ( x % 2 == 0 ) {
				System.out.println(x + "은(는) 짝수입니다.");
			} else {
				System.out.println(x + "은(는) 홀수 입니다.");
			} 
		}else if ( x==0 ) {
				System.out.println(x+"은(는) 0입니다");
		} else {
			System.out.println(x + "은(는) 음수 입니다.");
		}
	
		s.close();
	}
}
