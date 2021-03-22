package static_singleton;

public class Main {
	public static void main(String[] args) {
		
		
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		
		//싱글톤의 호출
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1==s2);
		s1.setS("이순신");
		System.out.println(s2.getS());
	}
}
