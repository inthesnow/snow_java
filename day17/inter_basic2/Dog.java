package inter_basic2;

public class Dog extends Animal implements IPet{
	public static final String name = "개";
	@Override
	public void eat() {
		System.out.println("강아지는 사료를 먹어요");
	}
	@Override
	public void play() {
		System.out.println("우리집에서 키우고있어요!");
	}	
}
