package day28.runble;

public class Main {
	public static void main(String[] args) {
		//runable인터페이스를 상속받는방법
		//쓰레드 클래스의 생성자 메게변수로 runable인터페이스르 구현하는 클래스를 전달
		ThreadTest test = new ThreadTest();
		
		Thread t= new Thread(test, "쓰레드1");
		t.start();
		

	}
}
