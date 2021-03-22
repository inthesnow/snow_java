package inter_basic;

public interface Inter1 {
	
	//상수와 추상메서드를 정의
	/*public static final(자동생략)*/double PI = 3.14;
	//인터페이스는 변수를 선언하면 자동으로 상수가 된다

	public void method1();//메서드를 선언시 자동으로 추상메서드가 된다. > 몸통을 가질 수 없다.
	
	//static을 선언하여 몸통을 가지게 할 수 있지만 인터페이스가 아닌 다른 저장공간에 저장되게 된다.
}
