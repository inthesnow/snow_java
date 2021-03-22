package day07;

public class EnhancedForEx {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		//향상된 for문
		for(int i : arr ) {
			System.out.print(i);
		}
		System.out.println();
		
		//향상된 for문으로 출력
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		for(String i : arr2) {
			System.out.print(i);
		}
		System.out.println();
		//arr3의 평균과 합계
		int[] arr3 = {40, 20, 50, 30, 50};
		int sum = 0;
		
		for(int i : arr3) {
			sum += i;
		}
		double avg = (double)sum/arr3.length;
		System.out.println(sum);
		System.out.println(avg);
	}
}
