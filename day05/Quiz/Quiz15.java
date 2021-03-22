package Quiz;

public class Quiz15 {
	public static void main(String[] args) {
		
		//동전 = 금액을 큰금액부터 몇개가 나오는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		int count[] = new int[5];
		int change[] = new int[5];
		int money = 17780;
		
		int i = 0;
		while(i<arr.length) {
				change[i] = money/arr[i];
				count[i] = money%arr[i];
				money = count[i];
				
			i++;
		}
		System.out.println("천원 : " + change[0]);
		System.out.println("오백원 : " + change[1]);
		System.out.println("백원 : " + change[2]);
		System.out.println("오십원 : " + change[3]);
		System.out.println("십원 : " + change[4]);
		
	}
}
