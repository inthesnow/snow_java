package api.util.array;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		int[] arr = {4,3,5,1,2,7,6};
	
		//sort
		Arrays.sort(arr);
		//toString
		System.out.println(Arrays.toString(arr));
		
		//binarySearch - 값의 유무확인
		int index = Arrays.binarySearch(arr, 7);
		System.out.println("7이  있는 인덱스 위치 : " + index);//없는 값이면 음수값을 반환

		//copyOf, copyOfRange - 배열복사
		int[] arr2 = Arrays.copyOf(arr, arr.length);//복사할 배열의 이름, 복사할 길이
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 3, 7);//3~7까지만
		System.out.println(Arrays.toString(arr3));
		
		//aquals - 배열의 비교
		if (Arrays.equals(arr, arr2)) {
			System.out.println("배열의 내부 값이 동일함");
		}
		
	}
}
