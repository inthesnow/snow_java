package Quiz;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		
		//1~15번 학생의 출석을 체크
//		int a = 1;
//		
//		while(a<=15) {
//			System.out.println(a+"번 학생의 출석을 체크");
//			
//			a++;
//		}

		//구구단수를 입력받아서, 입력 받은 단수의 구구단을 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int x = s.nextInt();
		System.out.println(x+"단");
		int y=1;
		
		while(y<10) {
			int num = x*y;
			System.out.println(x+"x"+y+"="+num);
			y++;
		}
		
	}
}
