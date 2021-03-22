package day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			String[] arr = new String[100];
			
			int index = 0; //입력받은 개수(or 배열의 위치)를 나타낼 변수
			
			System.out.println("# 먹고 싶은 음식을 입력하세요.");
			System.out.println("# 중지하려면 [그만] 이라고 입력하세요.");
			
			while(true) {
				System.out.print(">");
				String menu = s.next();
				
				if(menu.equals("그만")) break;
				
				arr[index] = menu;
				index++;
			}
			//배열의 요소 출력
			System.out.print("먹고 싶은 음식 [");
			for(int i=0;i<index;i++) {
				System.out.print(arr[i]);
				if(i==index -1) break;
				System.out.print(", ");
			}
			System.out.print("]");
				
		}
}
