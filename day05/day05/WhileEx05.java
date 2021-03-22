package day05;

public class WhileEx05 {
	public static void main(String[] args) {
		
		//배열을 사용한 반복문
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		int i = 0;
		while(i < arr.length) {
			//System.out.println(arr[i]); //배열의 리스트 출력
			sum += arr[i];//배열 리스트의 합
			
			i++;
		}
		System.out.println(sum);
	}
}
