package Quiz;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요 > ");
		int n = s.nextInt();
		
		//1. 1~입력받은 수까지 3의 배수이거나, 4의 배수일경우에 (가로로) 출력.
		System.out.println("3의 배수이거나 4의 배수인 경우");
		int a = 1;
		while(a<=n) {
			if(a%3==0 || a%4==0) {
				System.out.print(a+" ");
			}
			a++;
		}
		System.out.println();
		
		//2. 1~입력받은 수까지 6의 배수의 합계
		int b=1;
		int sum = 0;
		while(b<=n) {
			if(b%6==0) {
				sum +=b;
			}
			b++;
		}
		System.out.println(n+"까지의 6의 배수의 합 : "+sum);
		
		//3. 1~1000까지 정수 중의 4배수이면서, 8의 배수가 아닌 수의 갯수
		int c=1;
		int r3=0;
		while(c<=1000) {
			if (c%4==0 && c%8!=0) {
				r3++;
			}
			c++;
		}
		System.out.println(r3);
		
		//4. 1000의 약수의 갯수
		int d=1;
		int r4=0;
		while(d<=1000) {
			if(1000%d==0) {
				r4++;
			}
			d++;
		}
		System.out.println(r4);
		
	}
}
