package static_init;

public class Main {
	public static void main(String[] args) {
		Computer c = new Computer();
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		System.out.println(Computer.model);
		System.out.println(Computer.compony);
	}
}
