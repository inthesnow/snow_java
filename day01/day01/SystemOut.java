package day01;

public class SystemOut {
	public static void main(String[] args) {
		//main + "ctrl+spacebar" = = 자동생성
		//코드실행 단축키 : ctrl +F11
		
		/**println() > 자동으로 줄바꿈 기능 삽입
		 * println()이 print보다 사용빈도가 높아 sysout 후 자동완성시 println이 나온다.
		 */
		
		System.out.println("안녕하세요");
		System.out.println("우리집 강아지는 장군이 입니다.");
		
		/*
		 * printf() : 형식 지정 출력문 (줄바꿈 미포함 상품)
		 * %d(정수), %f(실수, %.x =.x는 표현하고 싶은 소숫점 자릿수), %c(문자 - ' '), %s(문자열 - " ")
		 */
		System.out.printf("오늘은 %d일 입니다.\n", 15);
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 2, 15);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",2021, 2, 15);		

		System.out.printf("파이값은 %f입니다.\n", 3.14);
		System.out.printf("파이값은 %.2f입니다.\n", 3.14);
		System.out.printf("파이값은 %10.2f입니다.\n", 3.14);
		
		System.out.printf("%c는 %s\n", '저', "김승빈 입니다.");
	}
}
