package poly.basic3;

public class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(this.info());
	}
	Person(String name) {
	//	this.name = name;
	//	this.age = 1;
		this(name, 1);
	}
	Person() {
	//	this.name="이름 x";
	//	this.age=1;
		this("이름x", 1);
	}
	
	String info() {
		return "이름 : "+name+", 나이 : "+age;
	}
}
