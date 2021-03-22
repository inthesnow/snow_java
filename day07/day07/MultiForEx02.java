package day07;

import day01.SystemOut;

public class MultiForEx02 {
	public static void main(String[] args) {
		//중첩반복문에서 조건이 변경되는 형태
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * .....
		 */
		int star = 5;
		for(int i=0;i<star;i++) {
			System.out.print("*");
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//////////////////////////////////////////
		for(int i = 0; i<star; i++) {
			System.out.print("*");
			for(int j = 1 ; j <star-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//////////////////////////////////////////
		for(int i = 1; i < star ; i++) {
			for(int j = 0; j < star -i  ; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
