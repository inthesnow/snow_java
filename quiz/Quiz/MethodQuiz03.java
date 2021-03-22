package Quiz;

import java.util.Scanner;

public class MethodQuiz03 {
	public static void main(String[] args) {
	
		print();
		int num = input();

		
		String str = java(num);
		System.out.println("Quiz18 : " +str);
		
		System.out.println("Quiz19 : " +sum(num));
		
		System.out.println("Quiz20 : "+num+"의 약수의 갯수>"+primNum(num));
		
		int a = input();
		int b = input();
		System.out.println("Quiz21 : " +a+"~"+b+"의 사이 수의 합 > " +sumNum(a, b));
	}
	static void print() {
		System.out.println("정수를 입력하세요!");
	}
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		return num;
	}

	static String java( int num ) {
		String javac="";
		for(int i=0; i<num;i++) {
			if(i%2==0) {
				javac+="자";
			} else {
				javac+="바";
			}
		}
		return javac;	
	}
	
	static int sum(int num) {
		int sum =0;
		for(int i=1;i<=num+1;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	static int primNum(int a) {
		int num = 0;
		int count = 0;
		for(int i=1;i<a;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==2) {
					num++;
				}
			}
		}	
		return num;
	}
	static int sumNum(int a, int b) {
		int max = 0;
		int min = 0;
		int sum = 0;
		if (a>b) {
			max=a;
			min=b;
		} else {
			min=a;
			max=b;
		}
		for(int i = min;i<=max;i++) {
			sum+=i;
		}
		return sum;
	}

}
