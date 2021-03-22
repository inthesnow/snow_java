package day10;

public class MethodEx03 {
	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환 유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 떄문에 다른 메서드의 매개값으로도 사용됩니다.
		 * ex)print(매서드 호출);
		 * 
		 * 3. 반환이 없는 메서드는 void라고 적습니다.
		 * 4. 모든 메서드는 return키워드를 만나면 강제종료됩니다.
		 * 그래서 void형 메서드에게도 return키워드 사용이가능하고 return아래에는 코드작성이 불가능.
		 */
	
	int result = add(1,2);
	
	System.out.println("결과 : " + result);
	//void형은 return이 없기 때문에 호출만가능.
	sub(2,1);
	multi();
	}
	static int add(int a, int b) {
		return a+b;
	}
	//반환이 없는 메소드 - 반환이 없기 떄문에 출력문이나 변수에 저장이 안됨
	static void sub(int a, int b) {
		System.out.println("두수의 차 : " + (a-b));
	}
	//반환과 메게변수가 없는메서드
	static void multi() {
		System.out.println("안녕하세요?");
	}
	static void noReturn(String name) {
		if (name.equals("똑똑이")) {
			System.out.println("참잘했어요.");
			return;
		}
		System.out.println("틀렸습니다. 똑똑이를 입력해야해요.");
	}
	
}
