package api.lang.sb;

import java.util.Arrays;
import java.util.Scanner;

public class StrQuiz04 {
	public static void main(String[] args) {
		/*
		 * palindrome함수는 매개변수로 String을 받아서 회문 여부를 검사하는 메서드
		 * 회문 : 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장
		 * 
		 * ex)다시 합창 합시다, 다시다, 다같은것은같다,다시시다
		 * 문장은 공백을 포함해서 매개값을 받아도 됩니다.
		 * 회문이라면 "회문" 아니라면 "회문이아닙니다."를 리턴합니다.
		 */
		System.out.println("다시다 : "+palindrome("다시다"));
		System.out.println("다시, 합창 합시다. : "+palindrome("다시, 합창 합시다."));
		System.out.println("다 같은 것은 같다. : "+palindrome("다 같은 것은 같다."));
		System.out.println("다시합시다 : "+palindrome("다시합시다"));
		System.out.println("이건 회문이 아니야. : "+palindrome("이건 회문이아니야"));
	}

//	static String palindrome(String pal) {
//		String o = "회문";
//		String x = "회문이 아닙니다.";
//		pal = pal.replace(" ", "");
//		pal = pal.replace(",", "");
//		pal = pal.replace(".", "");
//
//		for (int i = 0; i < pal.length() / 2; i++) {
//			if (pal.charAt(i) != pal.charAt(pal.length() - 1 - i)) {
//				return o;
//			}
//		}
//		return x;
//	}
	static String palindrome(String pal) {
		String o = "회문";
		String x = "회문이 아닙니다.";
		pal = pal.replace(" ", "");
		pal = pal.replace(",", "");
		pal = pal.replace(".", "");
		
		StringBuffer sb = new StringBuffer(pal);
		return sb.reverse().toString().equals(pal)?o:x;
	}
	//외부라이브러리를 추가하는방법
	//프로젝트에 src폴더생성 > jar파일 추가 > 우클릭빌드패스 > lib텝 > external jar로 파일추가
}
