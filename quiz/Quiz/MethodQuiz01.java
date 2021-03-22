package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		method1();
		System.out.println(method2("2번 정답"));
		System.out.println(method3(1,2,3));
		System.out.println(method4(3));
		method5("A", 3);
		System.out.print("정수를 입력하세요 > ");
		int a = s.nextInt();
		System.out.print("정수를 입력하세요 > ");
		int b = s.nextInt();
		System.out.println(maxNum(a,b));
		System.out.println(abs(-5));
		char[] c = {'s', 'o', 'l'};
		System.out.println(method6(c));
		int[] a7 = {1,2,3,4,5};
		System.out.println(method7(a7));
		String a8 = "sol", b8 = "is";
		System.out.println(Arrays.toString(method8(a8,b8)));
		
	}
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String r2) {
		return r2;
	}
	static double method3(int a, int b, double c) {
			return a+b+c;
	}
	static String method4(int a) {
		String s = "";
		if (a%2==0) {
			s = "짝수";
		} else {
			s = "홀수";
		}
		return s;
	}
	static void method5(String a, int b) {
		String s = "";
		for(int i=1; i<=b;i++) {
			s+= a;
		}
		System.out.println(s);
	}
	static int maxNum(int a, int b) {
		int max=0;
		if(a>=b) {
			max=a;
		} else {
			max=b;
		}
		return max;	
	}
	static int abs(int a) {
		int r=0;
		if(a>=0) {
			r=0;
		}else {
			r = -a;
		}
		return r;
	}
	static String method6(char[] a) {

		String result = "";
		for(int i=0; i<a.length;i++) {
			result += a[i]; 
		}
		return result;
	}
	static int method7(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	static String[] method8(String a, String b) {
		String[] result = {a, b};
		return result;
	}

}
