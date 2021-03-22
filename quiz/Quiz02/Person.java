package Quiz02;

public class Person {
	String name;
	int age;
	int tall;
	
	Person(){

	}
	
	Person(String pName, int pAge, int pTall) {
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	void info() {
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age + "세");
		System.out.println("키 : " + tall);
	}
}
