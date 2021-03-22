package poly.instanceof_;

public class MainClass {
	public static void main(String[] args) {

		Student hong = new Student("홍길동", 20, "123");

		Teacher lee = new Teacher("이승철", 50, "가수");

		Employee son = new Employee("손흥민", 31, "축구");

		personInfo(son);
	}
	
	public static void personInfo(Person p ) {
		if(p instanceof Student) {
			System.out.println("학생정보입니다.");
			Student s = (Student)p;
			System.out.println(s.info());
		} else if (p instanceof Teacher) {
			System.out.println("선생정보입니다.");
			Teacher s = (Teacher)p;
			System.out.println(s.info());
		} else if (p instanceof Employee) {
			System.out.println("직원정보입니다.");
			Employee s = (Employee)p;
			System.out.println(s.info());
		} else {//부모 타입은 항상 마지막에
			System.out.println("사람정보입니다.");
			System.out.println(p.info());
		}
	}
	
}
