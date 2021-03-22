package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapQuiz02 {

	public static void main(String[] args) {
		
		//맵을 이용하는 key는 메뉴, value는 가격
		Map<String, Integer> map = new HashMap<>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("------음식 메뉴 관리-------");
			System.out.println("1. 신규 메뉴 등록"); 
			System.out.println("2. 메뉴판 전체 보기"); 
			System.out.println("3. 메뉴 수정"); 
			System.out.println("4. 메뉴 삭제"); 
			System.out.println("5. 종료"); //종료
			
			System.out.print("메뉴>");
			int menu = scan.nextInt();
			
			//switch, if를 이용해서..
			if(menu == 1) {
				//이미 등록된 메뉴인지 확인한 후에 메뉴로 등록.
				System.out.print("메뉴명입력>");
				String name = scan.next();
				
				if(map.containsKey(name) ) { //메뉴가 있는 경우
					System.out.println(name + "은 이미 등록된 메뉴 입니다");
				} else {
					System.out.print("가격>");
					int price = scan.nextInt();
					map.put(name, price);
				}
			} else if(menu == 2) {
				//메뉴와 가격을 전부 출력
				System.out.println("===========메뉴===========");
				Set<Entry<String, Integer>> set = map.entrySet();
				for(Entry<String, Integer> e :set ) {
					System.out.println("메뉴:" + e.getKey() + ", 가격:" + e.getValue());
				}
				System.out.println("=========================");
			} else if(menu == 3) {
				//변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정.
				System.out.print("수정할 메뉴>");
				String name = scan.next();
				
				if(map.containsKey(name)) { //이미 존재하는 경우
					System.out.print("가격>");
					int price = scan.nextInt();
					
					map.put(name, price); //map은 동일키를 넣으면 value가 수정됩니다.
					System.out.println(map.get(name) + "원->" + price + "원");
					
				} else { //없는 경우
					System.out.println(name + "은 메뉴에 없습니다");
				}
				
			} else if(menu == 4) {
				//삭제할 메뉴를 받아서 있다면 삭제
				
				System.out.print("삭제할 메뉴>");
				String name = scan.next();
				
				if(map.containsKey(name)) {
					map.remove(name); //삭제.
					System.out.println(name + "이 삭제 되었습니다");
				} else {
					System.out.println(name + "은 없는 메뉴입니다");
				}

			} else if(menu == 5) {
				System.out.println("프로그램 종료");
				scan.close();
				System.exit(0);
			} else {
				
				System.out.println("잘못 입력했습니다.");
			}
			
			
			
			
			
			
			
		}
		
		
	}
}
