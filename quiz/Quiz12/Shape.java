package Quiz12;

public abstract class Shape {
	
	private String name;
	public static final double pi = 3.14;
	
	
	public Shape() {
		this.name = name;
	}
	
	public abstract double getArea();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "도형이름 : "+name;
	}
	
}
