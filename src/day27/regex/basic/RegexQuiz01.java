package day27.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	public static void main(String[] args) {
		/*
		 * 가격 형식만 찾아서 추출하세요.
		 * ex) ~~~원
		 */
		String str = "헠4,500원 헐~ 1,200원 엏> 6000원ㅋ 120000원ㅎㅎ";
		
		String pattern = "\\d,\\d{3}\\원|\\d+\\원";
		Matcher m  = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println("추출 : "+m.group());
		}
	
	
	}
}
