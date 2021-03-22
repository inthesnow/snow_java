package inter_basic;

public class Main {
	public static void main(String[] args) {
		Basic b = new Basic();
		
		b.method1(); //override
		b.method2(); //override
		b.method3(); 
		
		System.out.println(b.ABC);
		System.out.println(b.PI);
		
		/*
		 * 인터페이스도 하나의 타입이 될 수 있습니다.
		 * 인터페이스에 객체를 저장했을 때, 다형성의 형태로 동일하게 실행
		 */
		
		
		Inter1 i1 = b; //Inter1 i1 = new Basic();
		i1.method1();
		
		Inter2 i2 = new Basic();
		i2.method2();
	
		Basic bb= (Basic)i1;
		bb.method1();
		bb.method2();
		bb.method3();
	}
}
