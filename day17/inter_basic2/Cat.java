package inter_basic2;

public class Cat extends Animal implements IPet{
	
	public static final String name = "고양이";
	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요");
	}

	@Override
	public void play() {
		System.out.println("우리집에서 키우고있어요!");
	}
	
	
}
