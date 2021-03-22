package intet_basic3;

public class Lg implements Printed{
	
	private String logo = "Life is good";
	
	@Override
	public void turnOn() {
		System.out.println(logo);
		System.out.println("전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println(logo);
		System.out.println("전원을 끔니다.");
	}

	@Override
	public void print(String document) {
		System.out.println("내용 : " + document);		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("내용 : " + document);
		System.out.println("색상 : " + color);
	}

	@Override
	public void copy(int a) {
			System.out.println(a+"장만큼 복사");
	}
}
