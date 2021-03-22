package group_quiz;

public abstract class Unit {
	
	public int x;
	public int y;
	public int hp;
	public String name;
	
	public Unit() {	}
	
	public Unit(int x, int y, int hp, String name) {
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.name = name;
		
	}
	

	public abstract void hold();
	public abstract void move(int x, int y);
	public abstract void inMove(int x, int y);
	
	public void stop() {
		System.out.println("stop!");
	}
	
	
	
}
