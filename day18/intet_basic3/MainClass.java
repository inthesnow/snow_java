package intet_basic3;

public class MainClass {
	
	static Printed p;
	
	public static void main(String[] args) {
	//	p=new Lg();
		p=new Samsung();
		
		p.turnOn();
		p.print("가나다");
		p.colorPrint("마바사", "검정");
		p.copy(10);
		p.turnOff();
	}
}
