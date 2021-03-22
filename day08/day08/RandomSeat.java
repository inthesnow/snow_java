package day08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {
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
		int size = s.nextInt();
		int[] arr = new int[size];
		int[] seatNum = new int[size];
		String[] o = new String[size];
//		boolean esc = true;

		for(int i=0;i<arr.length;i++) {
			int num = (int)(Math.random()*size+1);
			System.out.println("log"+num);
			seatNum[i] = num;
			System.out.println("1"+Arrays.toString(seatNum));
			for(int j =0;j<i;j++) {
				while(seatNum[i]==seatNum[j]) {
					seatNum[i] = (int)(Math.random()*size+1);
					System.out.println("2"+Arrays.toString(seatNum));
				} 
			}
				
		}
		System.out.println("3"+Arrays.toString(seatNum));
		
		do {
			System.out.println("좌석 선택 프로그램 -----------------------------------");
			for(int i=0;i<arr.length;i++) {
				arr[i] = i+1;
				System.out.printf("%3d", arr[i]);				
			}
			System.out.println();
			
			for(int i=0;i<arr.length;i++) {
				if(o[i] == "●") {
					o[i] = "●";
				} else {
					o[i] = "○";
				}
				System.out.printf("%3s", o[i]);
			}
			System.out.println();
			
			System.out.print("좌석 선택 > ");
			int seat = s.nextInt()-1;
			
			if(seat <= size) {
				if(o[seat]!="●") {
				o[seat] = "●";
				System.out.printf("자리번호를 공개합니다 : %d\n", seatNum[seat]);
				} else {
					System.out.println("이미 선택된 번호입니다.");
				}
			} else {
				System.out.println("좌석 번호가 옳바르지 않습니다.");
			}
			
		//	esc = false;
		}while(true);
	}
}
