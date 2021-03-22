package static_feld;

public class Main {
	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반맴버변수 : "+c1.a);
		System.out.println("정적맴버변수 : "+c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반맴버변수 : "+c2.a);
		System.out.println("정적맴버변수 : "+c2.b);
	
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반맴버변수 : "+c3.a);
		System.out.println("정적맴버변수 : "+c3.b);
	
	/*
	 * static은 클래스 외부에 1개 생성된다. 의 의미를 갖는다.
	 * 그래스 static변수는 객체와 상관없기 때문에
	 * 
	 * 클래스이름,변수명으로 사용할수 있다.
	 */
		Count.b++;//매우중요.
		
	}
}