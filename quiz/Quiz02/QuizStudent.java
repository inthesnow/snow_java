package Quiz02;

public class QuizStudent {
	public static void main(String[] args) {
		/*
		 * 맴버 변수
		 * name, no, kor, eng, math
		 * 생성자
		 * 5개를 매개변수로 받아서 초기화하는 생성자
		 * 
		 * getTotal()-국,영,수 점수를 모두 더해서 double형으로 반환
		 * getAvg() - 총점을 나눈 평균을 double형으로 반환(소수점 2자리까지 *100/100.0)
		 */
		Student stu1 = new Student("홍길동", 1, 13, 24, 36);
		Student stu2 = new Student("고길동", 2, 100, 90, 80);
		
		double total = stu1.getTotal();
		double avg = stu1.getAvg();
		System.out.println(stu1.name+"의 성적의 총합은 "+total);
		System.out.println(stu1.name+"의 성적의 평균은 "+avg);

		double total2 = stu2.getTotal();
		double avg2 = stu2.getAvg();
		System.out.println(stu2.name+"의 성적의 총합은 "+total2);
		System.out.println(stu2.name+"의 성적의 평균은 "+avg2);
	}
}
