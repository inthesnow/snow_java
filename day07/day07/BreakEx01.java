package day07;

public class BreakEx01 {
	public static void main(String[] args) {
		/*
		 * 무한 반복문 - 정확히 반복 횟수를 모들 때 사용하고 특정조건에서 반복문을 종료 시킬때 사용 
		 */
		
		int i =1;
		while(true) {
			System.out.println(i);

			if(i==15) {
				break;
			}
			
			i++;
		}
	}
}
