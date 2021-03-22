package Quiz03;

public class Player {
	String id;
	int hp;
	int mp;
	int attack;
	int armor;
	
	void info() {
		System.out.println("캐릭터명 : " +id);
		System.out.println("체력 : " +hp+", 마나 : "+mp);
		System.out.println("공격력 : " +attack+", 방어력"+armor);
	}

}
