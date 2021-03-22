package day22_24.api.util.token;

import java.util.StringTokenizer;

public class TokenEx2 {
	public static void main(String[] args) {
		String str = "2021.03.17, 수요일, /bno=30, id=홍길자";
		//여러개의 구분자사용
		StringTokenizer token = new StringTokenizer(str, ",./");
		while(token.hasMoreElements()) {
			System.out.println(token.nextToken());
		}
		
		//구분자를 포함해서 자름
		StringTokenizer token2 = new StringTokenizer(str, " ", true); //공백을 기준으로 좋음		
		while(token2.hasMoreElements()) {
			System.out.println(token2.nextToken());
		}
	}
}
