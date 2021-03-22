package day03;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr; //int형 qo별 arr 선언
		
		//2. 배열의 생성 - 크기지정
		arr = new int[5]; //배열 arr을 크기 5로 생성
				
		System.out.println(arr);
		
		//3. 배열의 초기화 (값을 지정)
		arr[0] = 10; // 배열 arr의 첫뻔째 공백에 10을 지정
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//4-1. 배열의 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]); //배열의 인덱스 부분을 지정하여 사용
		
		//4-2. 활용
		arr[2] = 1000;
		System.out.println(arr[2]);

		//5. 배열의 저장된 값을 한눈에 확인하는 방법
		System.out.println( Arrays.toString(arr) );
	}
}
