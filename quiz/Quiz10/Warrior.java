package Quiz10;

public class Warrior extends Player {

	public Warrior(String uId) {
		this.id = uId;
		this.hp = 1000;
		this.mp = 500;
		this.attack = 10;
		this.armor = 10;
	}
	void bash(Player p) {
		if(mp>=100) {
			System.out.println(p.id+"에게 스킬을 사용");
			this.mp -= 100;
			if(p instanceof Warrior) {
				p.hp-=(100-p.armor);
			} else {
				p.hp-=(200-p.armor);
			}
		} else {
			System.out.println("mp가 부족합니다.");
		}
	}
	public void info() {
		System.out.println("캐릭터명 : " + id);
		System.out.println("체력" + hp);
		System.out.println("마나" + mp);
	}
}
