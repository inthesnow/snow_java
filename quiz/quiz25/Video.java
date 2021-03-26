package quiz25;

public class Video implements Runnable{

	@Override
	public void run() {
		 for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
