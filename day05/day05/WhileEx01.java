package day05;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int a = 1;//제어 변수 : 반복문의 횟수를 제어할 변수
		while ( a <= 10 ) {
			System.out.println(a);
			
			a++;//제어변수를 조작해 조건을 fales에 도달하게 처리
		}
		
		//1~10까지의 합?
		int a2 = 0; //누적
		int sum = 0;
		while (a2 <= 10) {
			sum += a2;
			
			System.out.println(sum);
			a2++;
		}
		
	}
}
