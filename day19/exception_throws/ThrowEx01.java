package exception_throws;

public class ThrowEx01 {
	public static void main(String[] args) {
		/*
		 * 예외만들기 -throw
		 * 메서드, 생성자에서 실행도중 throw키워드를 만나는 즉시 예외를 만들고, 예외처리구문을 찾습니다.
		 * 예외가 만들어지면 코드가 즉시 중단되고  가까히 있는 예외처리 구문으로 이동(catch영역)
		 */
		try {
			System.out.println("결과 : " +num(10));
			System.out.println("결과 : " +num(-4));
		} catch (Exception e) {
			//System.out.println("음수좀 넣지마 변태새끼야");
			//System.out.println(e.getMessage());//예외발생시 발생지역에서 메세지를 출력
			e.printStackTrace();//예외의 경로를 추적하는 메세지를 출력(예외의 원인을 찾을때 유용)
		}
	}
	//매개값을 받아서 합계를 리천하는 메서드
	public static int num(int a) throws Exception {
		int sum=0;
		if(a<0) {
			throw new Exception("곱게 양수 쓰세요^^");
		}
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
}
