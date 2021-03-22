package quiz18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		//1. User를 저장할 수 있는 list를 선언해 주세요.
		List<User> list = new ArrayList<>();
		
		while (true) {
			try {
				System.out.println("[1.등록 | 2.회원정보보기 |3.회원정보검색 | 4.회원정보삭제 | 5.종료");
				System.out.print("메뉴를 입력>");
				String menu = scan.next();
				int m = Integer.parseInt(menu);
				if (m == 1) {
					// 스캐너로 이름, 나이를 입력받고 User에 저장, 리스트에 추가
					while (true) {
						try {
							System.out.println("등록할 회원의 정보를 입력해주세요");
							System.out.print("이름 > ");
							String name = scan.next();
							System.out.print("나이 > ");
							String age = scan.next();

							User u = new User(name, Integer.parseInt(age));
							list.add(u);
							System.out.println("회원 정보가 추가되었습니다.");
							break;
						} catch (Exception e) {
							System.out.println("올바른 형식이 아닙니다.");
						}
					}
				} else if (m == 2) {
					// list에 길이만큼 회전하면서 User객체의 이름, 나이를 순서대로 출력
					int index=0;
					for (User i : list) {
						index++;
						System.out.println("회원 정보" + index + ". " + i.toString());
					}
				} else if (m == 3) {
					// 찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
					// 찾는 이름 없다면 "~~님은 목록에 없습니다" 를 출력합니다.
					System.out.print("회원의 이름을 입력해주세요 > ");
					String name = scan.next();
					for (int i=0;i<list.size();i++) {
						if(list.get(i).getName().equals(name)) {
							System.out.println(list.get(i).toString());
							break;
						} else {
							if(i==list.size()-1) 
								System.out.println(name +"님은 목록에 없습니다.");
						}
					}
				} else if (m == 4) {
					// 삭제할 이름을 입력받습니다. 입력받은 이름과 동일하다면 User객체를 삭제.
					System.out.print("회원의 이름을 입력해주세요 > ");
					String name = scan.next();
				
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getName().equals(name)) {
							System.out.println(list.get(i).getName() + "님의 회원 정보를 삭제");
							list.remove(i);
							break;
						} else {
							if(i==list.size()-1)
								System.out.println(name + "님은 목록에 없습니다.");
						}
					}
						
				} else if (m == 5) {
					// 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				} else {
					System.out.println("다시 입력하세요");
				}
			} catch (Exception e) {
				System.out.println("옳바른 명령을 입력해주세요");
			}
		}
		scan.close();
	}
}
