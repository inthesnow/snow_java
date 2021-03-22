package Quiz10;

public class MainClass {
	public static void main(String[] args) {
	/*
	 * 플레이어 클래스 부모클래스를 생성(공통기능을 갖도록 처리)
	 * 마법사, 전사는 플레이어를 상속받고
	 * 각각의 생성자도 만들어주세요
	 * 마법사와 전사의 객체생성
	 */
		Warrior me = new Warrior("내캐릭터");
		
		Warrior war = new Warrior("전사");
		Wizard wi = new Wizard("마법사");
		
		
		me.bash(war);
		me.bash(wi);
		
		me.bash(war);
		me.bash(wi);
		
		war.info();
		wi.info();
		
		Player[] p = {me, war};
		wi.blizzard(p);
		wi.blizzard(p);
		wi.blizzard(p);
		wi.blizzard(p);
		wi.blizzard(p);
		
		me.info();
		war.info();
		wi.info();
		
		me.bash(war);
		me.bash(wi);
		
	}
}
