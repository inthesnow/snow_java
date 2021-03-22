package Quiz11;

public class Product {
	public String name;
	public int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("이름은"+name+"가격은"+price);

	}
}
