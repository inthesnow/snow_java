package day09;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete1 {

	public static void main(String[] args) {
		
		//배열의 삭제(5번재 index를 지운다)
	//	int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
		
	//	for(int i =5; i < arr.length-1; i++) {
		//	arr[i] = arr[i+1];
		//}
		
	
	//	System.out.println(Arrays.toString(arr));

		String[] arr = {"강타","토니안","문희준","장우혁","이재원"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름>");
		String name = scan.next();	
	
		int count = arr.length;
		boolean chk = false;
		
		for(int i =0; i <count; i++) {
			
			if(name.equals(arr[i])) {
				//현재위치에서 count-1미만 인덱스까지 요소를 당겨온다.
				
			for(int j=1; j < count-1; j++) {
				arr[j] = arr[j+1];
			}
			count--; //접근할 index
			chk = true;
			}
		}
		if(chk) {
			System.out.println("삭제후정보:[");
			for(int i =0; i <count; i++) {
			System.out.println(arr[i]);	
				if(i == count-1) break;
				System.out.println(" , ");
			}
			System.out.println("]");
		}
		System.out.println(Arrays.toString(arr));
	
	
	
	}
}
