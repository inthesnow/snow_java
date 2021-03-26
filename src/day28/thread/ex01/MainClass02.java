package day28.thread.ex01;

public class MainClass02 {
	public static void main(String[] args) {
		Thread t = new Thread();
		Thread test1 = new Thread(t, "A");//A thread
		Thread test2 = new Thread(t, "B");//B thread
		test1.start();
		test2.start();
		System.out.println("end");
	}
}
