package exception_multicatch;

public class MainClass {
	public static void main(String[] args) {
		
		//main에 인자값을 전달하는 방법
		//run_configuratioms > arguments > %{string_prompt}
		try {
			String data1 = args[0];
			String data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값을 반드시 2개이상 전달하세요");
		} catch (NullPointerException e) {
			System.out.println("실행 매개값을 tntwkfh 전달하세요");
		} catch (Exception e) {//예외의 상위 부모이기 때문에 모든 예외를 받아서 처리합니다. ctrl+t
			System.out.println("기타 예외입니다.");
		}
	}
}
