package day04;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
		//입력 받은 점수를 A, B, C, D, F 등급으로 분리
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("점수 > ");
		int point = scan.nextInt();
		
		if (point >= 90) {
			if( point > 100 ) {
				System.out.println("잘못된 점수입니다.");
			} else if (point >95) {
				System.out.println("A+ 입니다.");
			}  else {
				System.out.println("A 입니다.");
			}
		} else if (point >= 80) {
			if (point > 85) {
				System.out.println("B+ 입니다.");
			}  else {
				System.out.println("B 입니다.");
			}
		} else if (point >= 70) {
			if (point >75) {
				System.out.println("C+ 입니다.");
			}  else {
				System.out.println("C 입니다.");
			}
		} else if (point >= 60) {
			if (point >65) {
				System.out.println("D+ 입니다.");
			}  else {
				System.out.println("D 입니다.");
			}
		} else {
			System.out.println("F점 입니다.");
		}
		
		scan.close();
	}
}
