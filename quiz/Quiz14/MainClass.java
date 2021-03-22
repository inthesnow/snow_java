package Quiz14;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Melon m = new Melon();
		
		esc: while (true) {
			System.out.println("[메뉴]1.추가, 2.재생, 3.종료");
			System.out.print("> ");
			String menu = s.next();

			switch (menu) {
			case "추가":
			case "1":
				System.out.print("추가할 노래의 제목을 입력해주세요 > ");
				String add = s.next();
				m.insertList(add);
				System.out.println(add + "을(을) 리스트에 추가하였습니다.");
				System.out.println("현제 플레이 리스트에 저장된 곡 : " + m.playLength() + "개");
				break;
				
			case "2":
			case "재생":
				System.out.println("플레이리스트를 랜덤으로 재생합니다.");
				m.playList();
				break;
				
			case "3":
			case "종료":
				System.out.println("프로그램을 종료합니다");
				break esc;
			default:
				System.out.println("추가, 재성, 종료 중 하나만 입력하세요");
				break;
			}
		}
		s.close();
	}
}
