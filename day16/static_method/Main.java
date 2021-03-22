package static_method;

public class Main {
	public static void main(String[] args) {
		Count c = new Count();
		c.a=10;
		
		
		Count.method2();
		
		System.out.println(Count.b);
	}
}
