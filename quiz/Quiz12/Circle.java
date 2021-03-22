package Quiz12;

public class Circle extends Shape{
	/*
	 * 1. 원형은 생성될때 이름과, 변의 길이를 받도록 처리
	 * 2. getArea()는 원의 넓이를 오버라이딩
	 * 3. main에서 생성해서 도형의 이름을 확인
	 * 4. pi는 상수형태로 선언
	 */
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}

	public Circle(String name, int radius) {
		this.setName(name);
		this.radius = radius;
	}
	
	
	
}
