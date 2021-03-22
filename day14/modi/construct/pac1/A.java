package modi.construct.pac1;


public class A {
	//접근제어자는 클래스, 맴버변수, 생성자, 메서드에 다붙을 수 있습니다.(가장처음에 붙음)
	//클래스 접근제어자는 public, default만 있음
	//default는 접근제어자를 붙이지 않은 형태 - 같은 패키지만 사용가능
	//맴버변수
	A a1 = new A(1);//public
	A a2 = new A("홍길동");//default
	A a3 = new A(true);//private
	//생성자
	public A(int i ) {}
	A(String s) {}
	private A(boolean b) {}
}
