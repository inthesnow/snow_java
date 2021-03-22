package quiz15;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 통해서 정수 2개를 입력받습니다.
		 * 2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고 반복문을 종료하면됩니다.
		 * 3. 만약 입력받은 값이 예외를 발생시키는 값이라면, "정수로만 입력하세요"를 출력한 다음에 다시 처음부터 입력받습니다.
		 * 4. 반복문을 탈출하면 프로그램 종료 구문을 띄우세요!
		 * 
		 * ex)정확한 코드를 짜면 -무한루프!
		 */
		
		Scanner s = new Scanner(System.in);
		String a=null;
		String b=null;
		
		while (true) {
			System.out.println("정수 2개를 입력해주세요");
			System.out.print("> ");
			a = s.next();
			try {
				Integer.parseInt(a);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}
		}
		while (true) {
			System.out.print("> ");
			b = s.next();
			try {
				Integer.parseInt(b);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
			}
		}
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		System.out.println("프로그램을 종료합니다.");

	}
}
