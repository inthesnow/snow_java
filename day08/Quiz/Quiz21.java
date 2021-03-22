package Quiz;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		/*
		 * 가로, 세로를 스캐너를 통해 입력 받습니다.
		 * 가로길이, 세로길이만큼 사각형을 출력하면됩니다.
		 * 단, 윤곽만 나타내면됩니다.
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력 > ");
		int w = s.nextInt();
		System.out.print("정수를 입력 > ");
		int h = s.nextInt();
		
//		for (int i = 1 ; i <= w; i++) {
//			System.out.print("*");
//			if (i==w) {
//				for (int j = 1; j < h-1; j++) {
//					System.out.print("\n*");
//					for(int k=1; k<=w-2; k++) {
//						System.out.print(" ");
//					}
//					System.out.print("*");
//				}
//				
//			}
//		}
//		System.out.println();
//			
//		for (int i = 1 ; i <= w; i++) {
//			System.out.print("*");
//		}	
		for (int i = 1 ; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if(i==1 || i==h) {
					System.out.print("*");
				} else {
					if (j==1||j==w) {
						System.out.print("*");
					} else {
							System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		
	}
}
