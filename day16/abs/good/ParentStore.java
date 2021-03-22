package abs.good;

public abstract class ParentStore {
	/*
	 * 1. 메서드에 abstract키워드를 붙이면 추상메서드가 된다.
	 * 이메서드는 상속을 통해 반드시 오버라이딩 되어야한다.
	 * 2.추상메서드는 {}가 없는 메서드의 선언.
	 * 3. 추상메서드는 일반 클래스에 선언할 수 없다.
	 * 추상메서드를 사용하려면 클레스도 추상클레스가 되어야한다.
	 * 4. 추상클래서 는 일반메서드, 일반맴버변수, 생성자 모두 사용이 가능합니다.
	 *
	 */
	
	//맴버변수
	private String storeName="치킨 집이름이지만 과일가게";
	
	//생성자
	public ParentStore() {
		System.out.println("추상클래서 생성자호출");
	}
	//메서드
	public String getStorName() {
		return storeName;
	}
	public abstract void apple();
	public abstract void grape();
	public abstract void orange();
	
	public final void mango() {
		
	}

}