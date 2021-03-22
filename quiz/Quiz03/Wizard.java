package Quiz03;

public class Wizard extends Player{

	Wizard(String uId, int uHp, int uMp, int uAttack, int uArmor) {
		id = uId;
		hp = uHp;
		mp = uMp;
		attack = uAttack;
		armor = uArmor;
	}

	void bash() {
		System.out.println("마법사전용 스킬사용");
	}
}
