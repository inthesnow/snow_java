package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		
		/*
		 * 1. 입력받은 수까지의 크기를 갖는 배열을 생성.
		 * 1부터 입력받은 수까지 순서대로 배열에 저장
		 * 
		 * ex) 입력수 : 10
		 * [1,2,3,4,5,6,7,8,9,19]
		 */
		
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int i = 0;
		while(i<arr.length) {
			System.out.print("정수를 입력하세요 >");
			int n = s.nextInt();
			arr[i] = n;
			i++;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
