package Quiz02;

public class Quiz01 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 180);
		
		Person p2 = new Person();
		p2.name="김길동";
		p2.age=30;
		p2.tall=170;

		p1.info();
		p2.info();
	}
}
