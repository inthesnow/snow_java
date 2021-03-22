package day13;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 매서드, 생성자를 여러개 생산하는 것
	 * 규칙
	 * 1. 이름이 같다
	 * 2. 반환유형은 오버로딩에 영향을 미치치않는다
	 * 3. 매개변수의 타입 or 종류 or 순서가 다르면된다
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
// 반환유형은 영향을 미치지 않는다.	
//	int input(int a) {
//		return 0;	
//	}
	void input(String s) {
		System.out.println("문자열 1개 입력");

	}
	void input(int a, double b) {
		System.out.println("정수 1개, 상수 1개입력");
	}
	void input(double a, int b) {
		System.out.println("실수 1개 정수1개");
	}
	void input(char c, int a, double b) {
		System.out.println("문자 정수 실수 1개씩");
	}

}
