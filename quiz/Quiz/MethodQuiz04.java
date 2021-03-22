package Quiz;

import java.util.Arrays;

public class MethodQuiz04 {
	public static void main(String[] args) {
		//메서드의 매게변수, 반환 유형으로 배열을 전달하는 방법.
		int[] arr = {1,2,3};
		String[] arr2= {"A","B","c"};
		method1(arr, arr2);

		String[] arr3 = method2();
		System.out.println(Arrays.toString(arr3));
	
	}
	
	static void method1(int[] a, String[] b) {
		System.out.println(Arrays.toString(a));
	}
	static String[] method2() {
		String[] arr = {"월","화","수"};
		return arr;
	}
}
