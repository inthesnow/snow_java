package Quiz10;

public class Wizard extends Player{

	public Wizard(String uId) {
		this.id = uId;
		this.hp = 500;
		this.mp = 1000;
		this.attack = 20;
		this.armor = 5;
	}

	
	public void blizzard(Player[] p) {
		System.out.println("-----------------");
		System.out.println(this.id+"가 Blizzard 스킬을 사용");
		for(Player i: p) {
			int ran = (int)(Math.random()*6)+10;
			i.hp -= ran;
			System.out.println(i.id+"님이"+ran+"피해를 입었습니다." );
		}
		System.out.println("-----------------");
		
	
	}
	
	public void info() {
		System.out.println("캐릭터명 : " + id);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
	}
	//2. 블리자드 스킬은 매개변수로 플레이어 배열을 받습니다.
	/*
	 * 매개변수 players배열을 향상된 for문으로 회전
	 * for문 안에서는 10~15사이의 랜덤수를 발생
	 * players배열의 hp를 각각 랜덤수만큼 감소시킵니다.
	 * players배열의 이름과 함께 랜덤 피해를 각각 출력하면됩니다.
	 */
	//4. players 배열의 이름과 함께 랜덤 피해를 출력하세요


}

