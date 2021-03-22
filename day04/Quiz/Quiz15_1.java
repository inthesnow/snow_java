package Quiz;

public class Quiz15_1 {
	public static void main(String[] args) {
		
		//동전 = 금액을 큰금액부터 몇개가 나오는지 출력
		int[] arr = {1000, 500, 100, 50, 10};
		int change = 0;
		int money = 17780;
		
		int i = 0;
		while(i<arr.length) {
			if(money >= arr[i]) {
				System.out.println(arr[i] + "원 : " + money/arr[i]);
				money = money%arr[i];
				change++;
				i++;
			} else {
				change++;
				i++;
			}
		}
	}
}
