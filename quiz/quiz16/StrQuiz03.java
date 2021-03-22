package quiz16;

import java.util.Scanner;

public class StrQuiz03 {
	public static void main(String[] args) {
		// 실제 코딩테스트문제
		/*
		 * 자연수 자릿수의 합 구하기 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return하는 메서드 작성 조건 n은 1억 이하의 자연수
		 * n을 자료형 변환해서 연산하지 말것(스트링을 이용해서 한개 더 하셈 풉킼)
		 */
		System.out.println(test01(1234567));
		System.out.println(test02(1234567));
		
		System.out.println(test01(100000000));
		System.out.println(test02(100000000));
	}

	static int test01(int num) {
		int sum = 0;
			for (int i = 100000000; i > 0; i /= 10) {
				int n = num / i;
				num -= n * i;
				sum += n;
			}
			return sum;

	}

	static int test02(int num) {
		int sum = 0;

		String str = String.valueOf(num);
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				sum += (int) c - 48;
			}
			return sum;
	}

}