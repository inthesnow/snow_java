package Quiz02;

public class Quiz04 {
	public static void main(String[] args) {
		Quiz04Bank myAcc = new Quiz04Bank("홍길동", "1234", 3000);
		
		myAcc.deposit(900);
		myAcc.withDraw(500);
		
		int bal = myAcc.getBalace();
		System.out.println(myAcc.name+"님의 잔액은 : "+bal+"입니다.");
		
	}
	
}
