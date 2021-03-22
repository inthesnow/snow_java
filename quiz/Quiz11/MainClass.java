package Quiz11;

public class MainClass {
	public static void main(String[] args) {
		MyCart my = new MyCart(2000);
		
		Product tv = new Tv();
		Product radio = new Radio();
		Product com = new Computer();
		Product com1 = new Computer();
		
		Product[] l1= {tv, radio, com};
		my.buy(l1);
			
	}
}
