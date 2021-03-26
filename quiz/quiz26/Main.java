package quiz26;

public class Main {
	public static void main(String[] args) {
		VoteThread local1= new VoteThread();
		VoteThread local2= new VoteThread();
		VoteThread local3= new VoteThread();
		
		Thread l1 = new Thread(local1, "Location1개표율");
		Thread l2 = new Thread(local2, "Location2개표율");
		Thread l3 = new Thread(local3, "Location3개표율");
		
		l1.start();
		l2.start();
		l3.start();
	}
}
  