package day06;

public class DoWihileEx {
	public static void main(String[] args) {
		
		//while문 1~10까지의 합
		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum += i;
			
			i++;
		}
		System.out.println(sum);
		
		//dowhile문 1~10까지의 합
		int sum2 = 0;
		int k = 1;
		do {
			sum2 += k;
			
			k++;
		} while(k<=10);
		System.out.println(sum2);
	}
}
