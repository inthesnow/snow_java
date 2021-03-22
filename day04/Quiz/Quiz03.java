package Quiz;

public class Quiz03 {
	public static void main(String[] args) {
		
		//-10~10까지의 랜덤수를 만들고, 이 랜덤한 값이 0인지, 양수, 음수 인지 판별
		//조건 - if else 사용금지.
		
		int r = (int)(Math.random()*21 - 10);
		
		String result = (r == 0 ? 0 : r) ==0 ? "0" : (r < 0 ? "음수" : "양수");
		 
		System.out.println(r + "은 " + result);
		 
		
		/*
		 * if ( r == 0 ) { System.out.println( r + "은 0 입니다." ); } else if ( r > 0 ) {
		 * System.out.println( r + "은 양수입니다." ); } else { System.out.println( r +
		 * "은 음수입니다." ); }
		 */
			
	}
}
