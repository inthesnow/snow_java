package day11;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.info();
		
		Phone any = new Phone("빨강");
		any.info();
		
		Phone red = new Phone(300000, "빨강");
		red.info();
		
		Phone p4 = new Phone("갤럭시", "블랙");
		p4.info();
		
		//모든 맴버변수를 받아서 초기화 하는 생성자
		//green, 900000, 샤오미를 전달해서 객체생성
		Phone p5 = new Phone("샤오미",900000, "green");
		p5.info();
		
	}
}
