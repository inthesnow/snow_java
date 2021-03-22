package overriding.basic2;

public class Student extends Person {

	String studentId;
	
	String info() {
		return "이름 : "+name+", 나이 : "+age+", 아이디 : "+studentId;
	}
}
