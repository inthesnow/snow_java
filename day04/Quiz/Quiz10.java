package Quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수 > ");
		int i1 = s.nextInt();
		System.out.print("연산을 선택하세요 [+, -, *, /] > ");
		String s1 = s.next();
		System.out.print("정수 > ");
		int i2 = s.nextInt();
		
		switch (s1) {
		case "+":
			int num1 = i1 + i2;
			System.out.println("두수의 덧셈은? : " + num1);
			break;
		case "-":
			int num2 = i1 - i2;
			System.out.println("두수의 차는? : " + num2);
			break;
		case "*":
			int num3 = i1 * i2;
			System.out.println("두수의 곱셈은? : " + num3);
			break;
		case "/":
			double num4 = (double)i1 / i2;
			System.out.println("두수의 나눗셈은? : " + num4);
			break;

		default:
			System.out.println("올바른 수식이 아닙니다.");
			break;
		}
		
	}
}
