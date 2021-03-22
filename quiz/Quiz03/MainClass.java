package Quiz03;

public class MainClass {
	public static void main(String[] args) {
	/*
	 * 플레이어 클래스 부모클래스를 생성(공통기능을 갖도록 처리)
	 * 마법사, 전사는 플레이어를 상속받고
	 * 각각의 생성자도 만들어주세요
	 * 마법사와 전사의 객체생성
	 */
		Warrior war = new Warrior("전사", 500, 300, 30, 50);
		war.info();
		Wizard wi = new Wizard("마법사", 300, 500, 50, 30);
		wi.info();
		
		war.bash();
		wi.bash();
		
	}
}
