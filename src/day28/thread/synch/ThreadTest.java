package day28.thread.synch;

public class ThreadTest implements Runnable{
	int num = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i <10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				num++;
			}
			
			System.out.println("쓰레드 이름:" + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		
	}
	
}
