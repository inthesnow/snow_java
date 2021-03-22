package exception_myexception;

public class Main {
	public static void main(String[] args) {
		Account a = new Account("kim", "486", 10000);
		a.depsoit(10000);
		System.out.println(a.getBalance());
		a.withDraw(30000);
		//System.out.println(a.getBalance());		
	}
}
