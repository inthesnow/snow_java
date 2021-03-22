//package exception_throws;
//
//import java.lang.instrument.ClassFileTransformer;
//
//import exception.trycatch.TryCatchEx;
//
//public class Main {
//	public static void main(String[] args) {
//		
//		/*
//		 * 메서드, 생성자에서 발생되는 에러를 떠넘기는키워드 : throws
//		 * throws구무닝 붙어있는 메서드, 생성자를 호출할때 예외처리를 대신 진행해야한다.
//		 * 
//		 * 즉, 예외처리를 강요할때 사용
//		 */
//		
//		try {
//		greeting(1);
//	
//		} catch (Exception e) {
//			System.out.println("벼열의 범위를 벗어났습니다");
//		}
//		
//		try {
//			calc(0);
//		} catch (Exception e) {
//			System.out.println("0으로 나뉠수없음");
//		}
//	}
//	//
//	private static String[] arr= {"hello", "안녕", "니하오", "사요나라"};
//
//	public static void greeting(int index) throws ArithmeticException{
//		System.out.println(arr[index]);
//	}
//	
//	public static void calc(int num) throws Exception {
//		System.out.println(10/num);
//	}
//	
//	//대표적인 thows가 생략된 메소드와 생성자
//	try {			
//		Class.forName("#$f$#");
//	} catch (ClassNotFoundException e) {
//		
//	}
//	try {
//		new FileInputStream("@f#");			
//	} catch (ArithmeticException e) {
//		
//	}
//}
