package api.util.token;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String str1 = "오늘 날씨는 맑고, 매우 추워용";
		String str2 = "2021/03/17";
		
		StringTokenizer token = new StringTokenizer(str1);
		System.out.println("잘린토큰의 갯수 : "+token.countTokens());
		
		while(token.hasMoreTokens()) {//다음 토큰이있다면 T, 없으면 F
			System.out.println(token.nextToken());
		}
		
	
	}
}
