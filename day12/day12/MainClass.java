package day12;

public class MainClass {
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		/*
		 * 같은 클래스 내부에서 문자열을 동일하게 선언하면, 같은 String객체를 가리키가 됩니다.
		 * 하지만, 직접 String객체 생성 명령을 내리거나 다른클래스에서 넘어온 String은 다른 주소를 가진다.
		 * 그래서 문자열 비교시에 == 대신에 String클래스가 제공하는 equals()매서드 사용
		 */
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
	}
}
