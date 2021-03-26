package day28.thread.ex01;

public class MainClass {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		Thread test1 = new Thread(t1, "A");
		Thread test2 = new Thread(t2, "B");
	
		test1.start();
		test2.start();
	
	}
}
