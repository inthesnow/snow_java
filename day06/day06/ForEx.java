package day06;

public class ForEx {
	public static void main(String[] args) {
		 int sum = 0;
		 for(int i = 1; i<= 10; i++) {
			 sum += i;
		 }
		 System.out.println(sum);
		 
		 //10에서 시작해도 1로 감소하는 for문
		 for(int i=10; i>0; i--) {
			 System.out.println(i);
		 }
	}
}
