package Quiz;

public class Quiz16 {
	public static void main(String[] args) {
		//math.random()을 사용해서 2~9까지의 랜덤변수를 만들고, 해당구구단을 세로로 출력
		
		int x = (int)(Math.random()*9+1);
		
		System.out.println("구구단 "+x+"단");
		for(int i = 1; i < 10; i++) {
			System.out.println(x+" x "+i+" = "+x*i);
		}
	}
}
