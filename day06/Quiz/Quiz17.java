package Quiz;

import java.util.Iterator;

public class Quiz17 {
	public static void main(String[] args) {
		//for문으로 해결
		
		//1. 7~100까지 정수 중에 7의 배수를 가로로 출력(증감식을 7씩 증가)
		System.out.println("Quiz17-1. 7~100까지의 정수중 7의 배수");
		for (int i = 7; i<=100 ; i+=7) {
			System.out.print(i+ 	", ");
			
		}
		//2. 1~100까지의 12의 배수를 가로로 출력
		System.out.println("\n\nQuiz17-2. 1~100까지의 수중 12의 배수");
		for(int i = 1; i<=100 ; i++) {
			System.out.print(i%12==0?i+", ":"");
		}
		//3. 1~200까지의 정수중에 9의 배수의 갯수
		System.out.println("\n\nQuiz17-3. 1~200까지의 수중 9의 배수 갯수");
		int count = 0;
		for(int i = 1; i<=200 ; i++) {
			int a = i%9;
			if(a==0) {
				count++;
			}
		}
		System.out.println("9의 배수의 갯수는 : "+count);
		//4. 50~100까지 두 수 사이의 합.
		System.out.println("\nQuiz17-4. 50~100사이의 합");
		int sum = 0;
		for(int i = 50; i<=100 ; i++) {
			sum += i;
		}
		System.out.println("두 수 사이의 합은 :" + sum);
		//5. A~Z까지 가로로 출력(A의 숫자코드는 65, Z의 순자코드는 90)
		System.out.println("\nQuiz17-5. A부터 Z까지 출력");
		for(int i = 65; i<=90 ; i++) {
			System.out.print((char)i+", ");
		}
	
	}
}
