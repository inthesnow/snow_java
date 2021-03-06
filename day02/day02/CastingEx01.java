package day02;

public class CastingEx01 {
	public static void main(String[] args) {
		/*
		 * 크기가 작은 타입을 큰타입에 넣을 때는 
		 * 자바의 가상머신JVM이 자동으로 형변환을 해줍니다
		 */
		
		byte b = 10;
		short s= b; //byte > short로 변환
		int i = b; //byte > int로 변환
		long l = b; //byte > long으로 변환
		
		char c = '가';
		int j = c; // char의 유니코드 값을 int형으로 저장
		
		System.out.println("가의 유니코드 숫자값 : " + j);
		
		int t = 10;
		double d = t;//int > double로 변환
		System.out.println(d);
	}
}
