package Quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		//정수 2개를 입력 받아서 어떤 값이 큰수인지 출력, 같은 수일때, 같은 것을 확인
		Scanner s = new Scanner(System.in);
		
		System.out.print(">");
		int a = s.nextInt();
		System.out.print(">");
		int b = s.nextInt();
		
		String o = "는 같은 수 입니다.";
		String x = "보다 큰 수 입니다.";
		
		if (a>b) {
			System.out.println(a +"이(가)" + b + x);
		}else if (a==b) {
			System.out.println(a +"와(과)" + b + o);
		} else {
			System.out.println(b +"이(가)" + a + x);
		}
	
	}
	
}
