package quiz25;

public class Main {
	public static void main(String[] args) {
		Download d = new Download();
		Video v = new Video();
		
		Thread t = new Thread(d, "동영상");
		Thread t2 = new Thread(v, "비디오");
	
		t2.start();
		t.start();
	}
}
