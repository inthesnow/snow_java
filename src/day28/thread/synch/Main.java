package day28.thread.synch;

public class Main {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		
		Thread test = new Thread(t, "A");
		Thread test1 = new Thread(t, "B");
		
		test.start();
		test1.start();
	}
}
