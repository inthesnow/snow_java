package Quiz;

import java.util.Arrays;

public class Quiz19 {
	public static void main(String[] args) {
		
//		int x=0;
//		int y=1;
//		int temp =x;
//		x=y;
//		y=temp;
		
		/*
		 * 배열이 들어있는 값 중에서 절대 중복 되지 않는 숫자 3개를 랜덤으로 추출하려합니다.
		 * arr에서 절대 값이 중복되지 않게 추출된 3개의 값을 새로운 배열로 옮겨담으면 됩니다.
		 * 
		 * 방법 - 배열의 길이만큼 회전하되, 렌덤하게 뽑힌 인덱스 위치 값의 자리를 바꿉니다.
		 */
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		for(int i = 0;i<arr.length;i++) {
			int num1 = (int)(Math.random()*arr.length);
			int num2 = (int)(Math.random()*arr.length);
			
			int tmp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = tmp;
			
		}
		System.out.println(arr[0]+", "+arr[1]+ ", "+arr[2]);
		
		//0~2번째 값을 새로운 배열에 옴기세요
		int[] newArr = new int[3];
		for(int i=0;i<newArr.length;i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
}
