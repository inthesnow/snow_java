package day08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class newE {
	public static void main(String[] args) {
		/*
		 * 1. 사람 수를 입력 받을 수 있습니다.
		 * 2. 입력 받은 사람 만큼 랜덤 값을 생성해서 배열에 절대 중복 되지 않게 랜덤으로 저장합니다.
		 * 3. 해당배열의 크기만큼○으로 출력해주세요(ㅁ한자9)
		 * 4. 스캐너를 통해서 랜덤으로 배정된 좌석을 선택할 수 있습니다.
		 * 5. 제대로 선택된 좌석은 자리번호를 공개, 제대로 선택되지 않은 자리라면 "출력문을 통해 다시선택"
		 * 
		 * 선택된자리는 ●로 표시
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("배정할 좌석의 크기를 지정하세요 > ");
		int num = s.nextInt();
		
		String o = "○";
		String x = "●";
		int ran = 0;
		int seat=0;;
		
		while(true) {
			System.out.println("좌석 선택 프로그램 -----------------------------------");
			for(int i=1;i<=num;i++) {
				System.out.printf("%3d", i);				
			}
			System.out.println();
			
			for(int i=1;i<=num;i++) {
//				if (==x) {
					if (i==seat) {
						System.out.printf("%3s", x);
					} else {
						System.out.printf("%3s", o);
					}
//				} else
			}
			
			ran = (int)(Math.random()*num+1);

			System.out.println();
			System.out.print("좌석 선택 > ");
			seat = s.nextInt();
			
			if(seat <= num) {
//				seat = "●"; 
				System.out.printf("자리번호를 공개합니다 : %d\n", ran);
			} else {
				System.out.println("좌석번호가 옳바르지 않습니다.");
			}
			
		//	esc = false;
		}
	}
}
