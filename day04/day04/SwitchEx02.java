package day04;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Point>");
		int point = s.nextInt();
		
		switch (point/10) {
		case 1:
			System.out.println("F 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 9:
			if(point > 95) {
				System.out.println("A+ 입니다.");
			} else {
				System.out.println("A 입니다.");
			}
			break;

		default:
			break;
		}
		
		s.close();
	}
}
