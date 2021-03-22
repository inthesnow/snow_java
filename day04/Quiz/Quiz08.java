package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		//구입할 메뉴는 [수박, 사과, 멜론, 귤, 포도] 중 입력 받아 출력
		Scanner s = new Scanner(System.in);
		System.out.println("구입할 메뉴는?");
//		String[] flute = {"수박", "사과", "멜론", "귤", "포도"};
//		System.out.println(Arrays.toString(flute));
		System.out.println("[수박, 사과, 멜론, 귤, 포도]");
		System.out.print(">");
		String f = s.next();
		
		switch (f) {
		case "수박":
			System.out.println("2만원 입니다.");
			break;
		case "사과":
			System.out.println("1만원 입니다.");
			break;
		case "멜론":
			System.out.println("품절 입니다.");
			break;
		case "귤":
			System.out.println("5천원 입니다.");
			break;
		case "포도":
			System.out.println("8천원 입니다.");
			break;
		default:
			System.out.println(f + "는 없는 메뉴입니다.");
			break;
		}		
		
	}
}
