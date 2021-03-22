package Quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1. 1~100까지 랜덤한 정수를 생성하고, 3의 배수인지 아닌지 3항식으로 식별
		
		int r1 = (int)(Math.random() * 100) + 1;
		String result1 = r1 % 3 == 0 ? "맞다." : "아니다.";
		
		System.out.println(r1 + "은 3의 배수가"  + result1);
		
		
		//2. -5~5까지 랜덤한 정수를 생성하고, 무조건 절대값만 출력하는 3학연산식
		
		int r2 = (int)(Math.random() * 10 - 5) + 1;
		int result2 = r2  >= 0 ? r2 : r2 * -1 ;
		
		System.out.println(r2 + "의 절댓값은 "  + result2);
		
		
		
		/*3. 1~200까지의 랜덤한 수를 만드는데 이것을 사과의 개수라고 가정
		*bucket은 사과를 담는 바구니 입니다. (10개)
		*어떤사과가 나오던, 필요한 바구니의 개수를 구하는 3항 연산식을 만드세요
		*/
		int bucket;
		int r3 = (int)(Math.random() * 200) + 1;
		int result3 = r3 / 10 == 0 ? (bucket = r3 / 10) : (bucket = r3 / 10 + 1 );
		
		System.out.println("사과" + r3 + "개는 "  + result3 + "개의 Bucket이 필요하다.");
		
				
	}
}
