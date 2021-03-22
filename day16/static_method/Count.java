package static_method;

public class Count {
	public int a;
	public static int b;
	//일반 메서드 - 일반맴버변수, 정적맴버변수도 모두 사용가능.
	public int method1() {
		a = 10;
		return ++b;
	}
	//정적메서드 - static이 붙어 변수나 메서드만 사용간,ㅇ
	public static int method2() {
		
		//객체생성을통해 일반맴버변수도 사용가능
		Count c = new Count();
		c.a=10;
		
		return ++b;
	}
}
