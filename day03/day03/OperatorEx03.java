package day03;

public class OperatorEx03 {
	public static void main(String[] args) {
		
		//논리 연산자 &, |, &&, ||
		int x = 10, y = 20;
		
		if( x == 10 & ++y == 21) {
			System.out.println(true);
		} else {
			System.out.println(false);			
		}
		
		System.out.println("x는 : " + x + ", y는 : " + y);
		
		if(x == 10 | ++y == 21) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	
		System.out.println("x는 : " + x + ", y는 : " + y);

		if( x == 10 && ++y == 23) {
			System.out.println(true);
		} else {
			System.out.println(false);			
		}
		
		System.out.println("x는 : " + x + ", y는 : " + y);
		
		if(x == 10 || ++y == 21) { //앞에 식 x==10이 참이기 때문에 뒤에 연산은 실행을 하지 않음
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	
		System.out.println("x는 : " + x + ", y는 : " + y);
		
	}
}
