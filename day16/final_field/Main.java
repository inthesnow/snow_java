package final_field;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("123123", "권지민");
		Person p2 = new Person("123124", "권재관");

		System.out.println("국적 : "+ p1.nation);//사용은 자유 변경은 x
		
		System.out.println(p1.ssn);
		System.out.println(p2.ssn);
	}
}
