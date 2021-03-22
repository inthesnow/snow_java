package exception_myexception;

public class Account {
	
	private String name;
	private String passwd;
	private int balance;

	public Account(String name, String pw, int bal){
		this.name=name;
		this.passwd=pw;
		this.balance=bal;
	}
	
	public void depsoit(int money) {
		balance+=money;
	}
	public void withDraw(int money) {
		try {
			if(balance<money) {
				throw new Exception();
			}
			balance-=money;			
		} catch (Exception e) {
			System.out.println("잔액이부족합니다.");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
