package this_;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person("홍길동", 20);
		
		Person p2 = new Person("홍길동");
		
		Person p3 = new Person();
		
		System.out.println(p.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
	}
	
}
