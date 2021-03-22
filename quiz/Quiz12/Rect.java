package Quiz12;

public class Rect extends Shape{
	
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}

	public Rect(String name, int side) {
		this.setName(name);
		this.side = side;
	}
	
}
