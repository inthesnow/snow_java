package day28.runble;

public class ThreadTest implements Runnable{
	
	@Override
	public void run() {
		System.out.println("now thread");
		System.out.println("thread start");
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);//1초 stop
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main thread end.");
	}
}
