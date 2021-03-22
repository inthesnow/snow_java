package Quiz;

import java.util.Arrays;

public class Quiz23 {
	public static void main(String[] args) {
		
		int[] arr = {5, 23, 1, 43, 100, 200, 40};//오른차순정리
	
		//1회전 ->{1, 23, 5, 43, 100, 200, 40}
		//2회전 ->{1, 5, 23, 43, 100, 200, 40}
		//3회전 ->{1, 5, 23, 43, 100, 200, 40}
		//4회전 ->{1, 5, 23, 40, 100, 200, 43}
		//5회전 ->{1, 5, 23, 40, 43, 200, 100}
		//6회전 ->{1, 5, 23, 40, 43, 100, 200}
		
		//오름차순의 경우 i인덱스가 j인덱스보다 클때 위치변경
	
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;	
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
		
		//bubble short
		int[] arr1 = {5, 2, 43, 20, 1};
		//1cycle -{2, 5, 20, 1, 34}
		//1cycle -{2, 5, 1, 20, 43}
		//1cycle -{2, 1, 5, 20, 43}
		//1cycle -{1, 2, 5, 20, 43}
		for(int i=1; i<arr1.length; i++) {
			for(int j=0; j<arr1.length-i; j++) {
				if(arr1[j] > arr1[j+1]) {
					int tmp =arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = tmp;
				}
			}
		System.out.println(Arrays.toString(arr1));
		}	
	}
}
