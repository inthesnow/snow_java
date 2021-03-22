package day04;

public class SwitchEx01 {
	public static void main(String[] args) {
	
		int a = 10;
		
		//switch 구문의 소괄호에는 변수나, 변수의 대한 연산식이 들어감.
		switch(a) {
		case 0:
		case 1:
			System.out.println("1입니다.");
			break; // 탈출 케이스문 끝에는 break을 붙인다.
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		
		default : 
			System.out.println("1~3이 아닙니다.");
			break;
		}
		
	}
}
