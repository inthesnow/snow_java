package Quiz07;

public class MainClass {
	public static void main(String[] args) {
		SonicAp sa = new SonicAp("소닉");
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = 1;
		sa.fly();
		sa.land();
	}
}
