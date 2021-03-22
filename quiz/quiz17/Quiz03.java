package quiz17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 * 스캐너 이용해서 nextLine()으로 문장을 받습니다.
		 * 입력받은 문장을 토크나이저를 이용해서 공백기준으로 분리.
		 * 분리한 토큰 개수 출력
		 * for문으로 아래 출력형식으로 뽑아주세요.
		 * ex)
		 * 1.안녕
		 * 2.하세요.
		 * 3.오늘은
		 * 
		 * 분리된 토큰은 배열에 새롭게 저장
		 */
		
		Scanner s= new Scanner(System.in);
		System.out.print("문장입력> ");
		String str = s.nextLine();

		StringTokenizer token = new StringTokenizer(str, " ");
		System.out.println("잘린토큰의 갯수 : " + token.countTokens());
		
		String[] arr = new String[token.countTokens()];

		for (int i = 1; token.hasMoreElements(); i++) {
			String tk = token.nextToken();
			System.out.println(i + ". " + tk);
			arr[i - 1] = tk;
		}
		System.out.println(Arrays.toString(arr));
	}
}
