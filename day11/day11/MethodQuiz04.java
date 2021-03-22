package day11;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {
		/*
		int[] arr = {5, 4, 3, 2, 1};
		int[] arr2 = {5, 3, 4, 1, 2};
			
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
			
		//배열의 비교 (배열의 내부 요소가 동일하면 true, 아니면 false)
		System.out.println(Arrays.equals(arr,arr2));
 		*/
		int[] arr = LottoNum();
		long money = LottoNum(arr);
		System.out.println("당첨되기까지 사용한 금액 : " + money);
	
	}
	static int[] LottoNum() {
		int[] arr = new int[6];
		int index = 0;
		start : while(true) { 
			int ranNum = (int)(Math.random()*45+1);
			
			//중복검사
			for(int i = 0; i<index;i++) {
				if(ranNum==arr[i]) 
						continue start;
			}
			
			arr[index] = ranNum;
			index++;
			if(index==arr.length) break;
		}
		Arrays.sort(arr);
		return arr;
	}
	static long LottoNum(int[] arr) {
		long coin = 1;
		
		while(true) {
			int[] arr1 = LottoNum();
			Arrays.sort(arr1);
			if(Arrays.equals(arr, arr1)) {
				return coin*1000;
			} else {
				coin++;
			}
		}
	}
	
}
