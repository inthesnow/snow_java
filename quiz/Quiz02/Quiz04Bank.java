package Quiz02;

public class Quiz04Bank {
	String name;
	String pass;
	int balace;
	
	Quiz04Bank(String bName, String bPass, int bBalace){
		name = bName;
		pass = bPass;
		balace = bBalace;
	}
	void deposit(int a) {
		balace+=a;
	}
	void withDraw(int a) {
		balace-=a;
	}
	int getBalace() {
		return balace;
	}
}
