package exception_throws;

public class MainClass {
	public static void main(String[] args) {
		//메인
		try {			
			ThroewEx02 ex = new ThroewEx02();
		} catch (Exception e) {
			System.out.println("예외발생");
		}
		
		
	}
}
