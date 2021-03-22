package day09;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		
		int index = 0;
		
		System.out.println("#먹고싶은음식을 입력하세여");
		System.out.println("중지하려면[그만]이라고 입력하세여");
		while(true) {
			
			System.out.println(">");
			String menu = scan.next();
			
			if(menu.equals("그만") ) break;
			
			arr[index] = menu;
			index++;
		}
		
		System.out.print("먹고싶은 음식:[");
		for(int i= 0; i < index; i++) {
			System.out.print(arr[i]);
			if( i == index -1) break; 
			System.out.print(" , ");
		}
		System.out.print(" ] ");
	}
}
