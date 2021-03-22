package inter_basic2;

public class GoldFish extends Fish implements IPet{
	public static final String name = "금붕어";
	@Override
	public void swim() {
		System.out.println("금붕어는 연못에서 헤엄쳐요");
	}

	@Override
	public void play() {
		System.out.println("우리집에서 키우고있어요!");
	}
	
	
}
