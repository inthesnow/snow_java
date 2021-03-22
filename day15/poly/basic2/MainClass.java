package poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01(); //부모의 메서드
		c.method02(); //오버라이딩 메서드
		c.method03(); //자식의 메서드

		//다형성
		
		Parent p1 = c;
		p1.method01();
		p1.method02(); //parent의 기능만 사용할 수 있지만 오버라이딩된 메서드는 우선실행.
		//p1.method03(); > 자식메서드 사용 불가
	
		System.out.println(c);
		System.out.println(p);
		System.out.println(c==p1);
		
		//클래스 캐스팅
		Parent pp = new Child(); //다형성
		Child cc = (Child)pp; //캐스팅
		
		cc.method01();
		cc.method02();
		cc.method03();

		//Parent p3 = new Parent();
		//Child c3 = (Child)p3; > 다형성이 일어나지 않은 객체를 대상으로 캐스팅을 실행하면 에러가 발생
	}

}
