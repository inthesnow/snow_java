package poly.basic3;

public class MainClass {
	public static void main(String[] args) {
		/*
		//다형성 미적용
		Student hong = new Student("홍길동", 20, "123");
		Student park = new Student("박찬호", 21, "234");
		Student kim = new Student("김밥군", 22, "456");
		Teacher lee = new Teacher("이승철", 50, "가수");
		Teacher choi = new Teacher("최강창민", 30, "가수");
		Employee son = new Employee("손흥민", 31, "축구");
		
		Student[] arr1 = {hong, park, kim};
		Teacher[] arr2 = {lee, choi};
		Employee[] arr3 = {son};
		
		for(Student s : arr1) {
			System.out.println(s.info());
		}
		
		*/
		//다형성 적용이후
		/*
		Person hong = new Student("홍길동", 20, "123");
		Person park = new Student("박찬호", 21, "234");
		Person kim = new Student("김밥군", 22, "456");
		Person lee = new Teacher("이승철", 50, "가수");
		Person choi = new Teacher("최강창민", 30, "가수");
		Person son = new Employee("손흥민", 31, "축구");
		
		Person[] arr = {hong, park, kim, lee, choi, son};
		
		for(Person p : arr) {
			System.out.println(p.info());
		}
		*/
		House h = new House();
		h.info();
	}
	
}
