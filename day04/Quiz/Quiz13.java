package Quiz;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		
		/*
		 * 사용자가 0을 입력할 때 까지 값을 입력 받습니다.
		 * 0을 입력하면 그전까지 입력한 값들의 합을 출력하고, 종료
		 */
		Scanner s = new Scanner(System.in);

		int sum = 0;
		
		boolean i = true;
		while(i==true) {
			
				System.out.print("정수를 입력해주세요 > ");
				int num = s.nextInt();
				
				if(num!=0) {
					sum += num;
				} else {
					i = false;
				}
		}
		System.out.println("지금까지 정수의 합은"+ sum + "입니다." );
	}
}
