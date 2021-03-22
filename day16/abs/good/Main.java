package abs.good;

public class Main {
	public static void main(String[] args) {
		/*
		 * 추상메서드를 사용하면 오버라이딩이 강제되기때문에 실수를 줄일 수 있다.
		 */
		
		ParentStore s1 = new Store1();
		System.out.println(s1.getStorName());
		s1.apple();
		s1.grape();
		s1.orange();
		s1.mango();
		
		ParentStore s2 = new Store2();
		System.out.println(s2.getStorName());
		s2.apple();
		s2.grape();
		s2.orange();
		s2.mango();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
