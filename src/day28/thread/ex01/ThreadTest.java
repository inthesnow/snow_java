package day28.thread.ex01;

import org.omg.CORBA.Current;

public class ThreadTest implements Runnable{
	int num=0;

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("구분------");
			if(Thread.currentThread().getName().equalsIgnoreCase("a")) {
				num++;
			}
			System.out.println("thread name" +Thread.currentThread().getName()+", num:"+num);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
