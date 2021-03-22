package group_quiz;

public class Tank extends Unit {
	
	public static int Attack = 5;
	public static final String Name = "탱크";
	
	public Tank() {
		super(0, 1, 150, Name);
	}
	/*
	 * hold()의 기능
	 * 마린의 현제 위치를 출력, stop메서트 출력
	 */
	@Override
	public void hold() {		
		String z = "("+this.x+","+this.y+")";
		System.out.println("현재 탱크의 위치 : " +z);
		stop();
	}
	/*
	 * move()의 기능
	 * 1. 현제의 좌표값에서 매개변수의 좌표만큼 이동한 거리를 구합니다.
	 *  공식 피타고라스, 루트- math.sqrt(값)
	 * 2. 현제 좌표값을 매개변수의 좌표값으로 변경.
	 * 3. 이동한 거리를 상수형으로 출력.
	 */
	@Override
	public void move(int x, int y) {
		int x2 = (x-this.x)*(x-this.x);
		int y2 = (y-this.y)*(y-this.y);
		int root =  (int)Math.sqrt(x2+y2);
		this.x=x;
		this.y=y;
		System.out.println("이동한 거리는 : "+root);
	}
	
	public void inMove(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
