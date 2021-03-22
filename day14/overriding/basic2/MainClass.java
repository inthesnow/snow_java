package overriding.basic2;

public class MainClass {
	public static void main(String[] args) {
		Person p = new Person();
		p.name= "홍길동";
		p.age = 30;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name="이순신";
		s.age=20;
		s.studentId="123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name="임재범";
		t.age=40;
		t.subject="음악";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name="김직원";
		e.age=35;
		e.department="인사";
		System.out.println(e.info());
		
		
	
	}
	
}
