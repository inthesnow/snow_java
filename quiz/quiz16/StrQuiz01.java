package quiz16;

import java.util.Scanner;

public class StrQuiz01 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 id를 입력 받습니다.
		 * 아이디는 공백은 포함해서 받을 수 있습니다.
		 * 단, 공백을 제거한 아이디가 4글자 미만이면 다시 입력 받으세요.
		 * 4글자 이상이라면 "id가 등록 되었습니다" 출력하고 종료.
		 */
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("아무노래나일단 틀어~ > ");
			String id = s.next();
			id = id.replace(" ", "");
			if (id.length() < 4) {
				System.out.println("4글자 이상 입력하세요");
			} else {
				System.out.println(id+"가 등록되었습니다.");
				break;
			}
		}
	}
}
