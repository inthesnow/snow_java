package Quiz;

import java.util.Scanner;

public class MethodQuiz02 {
	public static void main(String[] args) {
		print();
		int num1 = input();
		int num2 = input();
		int result = add(num1, num2);
		showResult(result);
	}
	static void print() {
		System.out.println("정수 두개를 입력하세요!");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		return num;
	}
	static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	static void showResult(int result) {
		System.out.println("덧셈 결과:" + result);
	}
}
