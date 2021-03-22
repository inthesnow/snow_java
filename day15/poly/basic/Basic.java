package poly.basic;
/*
 *  자바에서 하나의 클래스 파일안에는 여러 클래스가 가능합니다.
 *  단, 파일명과 동일한 클래스가 존재해야하고, 해당 클래스만 public이어야 한다.(예제 용도)
 *  %객체지향적 사용법이아님.
 */

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class Basic {
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	//기본타입에서
	int x = 10;
	double y = x;	// int > double 자동형변환
	
	//참조타입에서 %상속관계가 없다면 타형성 적용 불가능
	A a1 = b; // B가 A로 자동형변환
	A a2 = c;
	A a3 = new D();

	//모든 클래스는 Object의 자식클래스가 되기 때문에 Object형에 모든 타입을 저장 할 수 있습니다.
	Object o = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
}
