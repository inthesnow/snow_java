package quiz17;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * Math.ceil을 이용
		 * 1-10까지 값이 전달되면 1을 반환
		 * 11-20까지 값이 전달되면 2를 반환
		 * 21-30까지 값이 전달되면 3을 반환
		 * ....
		 */
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.print("> ");
			double a = s.nextDouble();
			int z = (int)Math.ceil(a/10);
			System.out.println(z);

			if (a == 0)	break;
		}
	}
}
