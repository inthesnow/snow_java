package day04;

public class IfEx {
	public static void main(String[] args) {
		int point = (int)(Math.random() *101);
		
		System.out.println("점수 : " + point);
		
		if (point >= 60) {
			System.out.println("축하합니다!");
			System.out.println("합격입니다!");
		} else { //else문이 없다면 if 단독으로 실행가능
			System.out.println("불합격입니다.");
		}
		
	}
}
