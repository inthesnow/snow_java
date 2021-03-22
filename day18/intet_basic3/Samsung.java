package intet_basic3;

public class Samsung  implements Printed{
	
	private String logo = "대충 삼성 로고 였던 것.";
	
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
		for(int i = 1; i<=a; i++) {
			System.out.println(i+"장만큼 복사");
		}
	}
	
	
}
