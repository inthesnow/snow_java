package day04;

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

		//5. 배열의 저장된 값을 한눈에 확인하는 메서드 > Array.toString()
		System.out.println( Arrays.toString(arr) );

		//6. 배열의 길이를 확인하는 메서드 > 배열의이름.length
		System.out.println(arr.length);
		
		//7. 선언과 생성을 동시에
		byte[] arr2 = new byte[7];
	
		
		//8 선언과 생성과 초기화를 동시에
		short[] arr3 = {1, 2, 3, 4, 5};
		// = short[] arr3 = new short {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(arr2)); //초기화하지 않아도 타입의 기본값으로 초기화
		System.out.println(Arrays.toString(arr3));
		
		//1. 문자열 배열을 생성하는 본인의 이름과, 전화번호를 문자열로 저장
		String[] r1 = {"김승빈", "01057364533"};
		/*
		 * String[] r1 = new String[2];
		 * r1[0] = "김승빈";
		 * r1[1] = "01057364533";
		 */
		System.out.println("내 이름은 " + r1[0]);
		System.out.println("내 전화번호는 " + r1[1]);
		
		//2. 크기가 3인 int형 배열에 1~3까지의 랜덤 값을 각각 저장
		int[] r2 = {
				(int)(Math.random()*3+1),
				(int)(Math.random()*3+1),
				(int)(Math.random()*3+1)
				};
		/*
		* int[] r2 = new int[3];
		* r2[0] = (int)(Math*3+1);
		* r2[1] = (int)(Math*3+1);
		* r2[2] = (int)(Math*3+1);
		*/
		System.out.println(Arrays.toString(r2));
	}
}
