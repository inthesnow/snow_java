package Quiz03;

public class Warrior extends Player {

	Warrior(String uId, int uHp, int uMp, int uAttack, int uArmor) {
		id = uId;
		hp = uHp;
		mp = uMp;
		attack = uAttack;
		armor = uArmor;
	}
	void bash() {
		System.out.println("전사전용 스킬사용");
	}
	
}
