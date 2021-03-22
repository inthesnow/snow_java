package day13;

import java.util.Arrays;

public class Quiz01 {
	/*
	 * 요구사항 Calculator룰 부모클래스로 선언하세요
	 * Calculator를 상속받는 Compute 클래스를 생성합니다
	 * 
	 * Calculator의 맴버변수 result, pi를 선언하세요
	 * Calculator의 매서드
	 * multi(int) : int -result에 값을 곱하기 가능
	 * div(int) : int -result에 값을 나누기 기능
	 * circle(int)  : double -pi를 이용하여 임의 넓이를 구하는기능
	 * ------------------------------------------------
	 * Computer클래스의 메서드
	 * circle()매서드를 오버라이딩하고, pi대신하는 Math.pi를 사용해서 임의 넓이를 구하세요
	 * rect(double): double - 정사각형의 넓이를 리턴
	 * rect(double, double) : double - 직사각형의 넓이를 리턴
	 * rect(double, double, double) : double - 직육면체의 넓이를 리턴
	 * 
	 *  메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요
	 */
	public static void main(String[] args) {
		Calculrator cal = new Calculrator();
		Computer com = new Computer();
		
		System.out.println(cal.multi(10));
		System.out.println(cal.div(10));
		System.out.println(cal.circle(10));
		
		System.out.println(com.circle(10));
		System.out.println(com.rect(10));
		System.out.println(com.rect(10,11));
		System.out.println(com.rect(10,10,11));
		
		ArrayPrint ap = new ArrayPrint();
		int[] arr = {1,2,3,4,5};
		System.out.println(ap.printArray(arr));
		double[] arr1 = {1,2,3,4,5};
		System.out.println(ap.printArray(arr1));
		String[] arr2 = {"A", "B", "C", "D"};
		System.out.println(ap.printArray(arr2));
	
		String a="홍길동";
		ap.test(a);		
		System.out.println(a);
		
		String[] a2= {"가", "나", "다"};
		ap.test(a2);
		System.out.println(Arrays.toString(a2));
	}
}
