package Quiz;

import java.util.Scanner;

public class Quiz25 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 투입해 주세요 > ");
		int money = s.nextInt();
		int sum = 0;
		
		String list1 = "[1]데미소다 : 400원";
		String list2 = "[2]밀키스 : 500원";
		String list3 = "[3]펩시 : 600원";
		String list4 = "[4]잔돈받기";
		
		
		es:while(true) {
			if(money >400) {
				System.out.println("남은 금액 : " + money);
				System.out.println(list1+", "+list2+", "+list3+", "+list4);
			
				System.out.print("음료 선택 > ");
				int choice = s.nextInt();
				
				switch (choice) {
				case 1:
					if(money>=400) {
						System.out.println("데미소다를 받았습니다");
						money -= 400;
					} else {
						System.out.println("금액이부족합니다.");
					}
					break;
				case 2:
					if(money>400) {
						System.out.println("밀키스를 받았습니다");
						money -= 500;
					} else {
						System.out.println("금액이부족합니다.");
					}
					break;
				case 3:
					if(money>400) {
						System.out.println("펩시를 받았습니다");
						money -= 600;
					} else {
						System.out.println("금액이부족합니다.");
					}
					break;
				case 4:
					System.out.println("잔돈 "+money+"를 반환 합니다.");
					break es;
					
				default:
					System.out.println("잘못된 값을 입력했습니다.");
					break;
				}
			} else {
				System.out.println("잔돈 "+money+"를 반환 합니다.");
				break;
			}
		}
		
	}
}
