package inter_basic;

public class Basic implements Inter1, Inter2 {
	/*
	 * 인터페이스 상속(구현) 하려면 implements 키워드 사용.
	 * 인터페이스는 여러 인터페이스를 구현 할 수 있다.
	 */
	@Override
	public void method1() {
		System.out.println("Inter1의 재정의 된 메서드 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("Inter2의 재정의 된 메서드 실행");
		
	}
	
	public void method3() {
		System.out.println("Basic에서 정의된 메서드 실행");
	}
	
	
}
