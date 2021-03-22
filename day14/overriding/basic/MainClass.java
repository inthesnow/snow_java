package overriding.basic;

public class MainClass {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
	}
}
