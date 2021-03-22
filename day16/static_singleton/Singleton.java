package static_singleton;

import java.security.Signature;

public class Singleton {

	//싱글론패턴 - 클래스가 여러번 호출되더라도 객체를 1개만 생성하도록 디자인 하는 방법
	
	//1. 접근제어자를 private로 선언하고 스스로 객체를 단 1개생성.
	private static Singleton instance = new Singleton();

	//2. 접근제어자를 이용해서 외부에서 객체를 생성 못하도록 막는다.
	private Singleton() {
		
	}

	//3. 외부에서 객체를 요구할 경우 1번에서 만들어둔 단 한개의 객체를 반환
	public static Singleton getInstance() {
		return instance;
	}
	private String s= "홍길동";
	
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}


}
