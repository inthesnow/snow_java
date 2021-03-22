package Quiz12;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle("원", 10);
		Rect r = new Rect("정사각형", 10);
		
		System.out.println(r.getName());
		System.out.println(r.getArea());
		System.out.println(c.getName());
		System.out.println(c.getArea());
		
	}
}
