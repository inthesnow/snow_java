package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	public static void main(String[] args) {
		/*
		 * 상품번호, 편의점 명 (도시락명) 가격 형식만 찾아서 추출하세요.
		 * ex) ~~~원
		 */
		String str = "123123-456456 Gs25(마늘햄쌈) 4,400원";
		String str2 = "111111-222222 Gs25(치킨도시락) 5,600원";
		String str3 = "222222-333333 MINISTOP(제육볶음) 5,700원";
		data(str);
		data(str2);
		data(str3);
	}
	
	static void data(String stR) {
		String str = stR;
		String pattern = "\\d{6}-\\d{6}";
		String pattern2 = "\\s\\w{3,7}";
		String pattern3 = "\\([가-힝]+\\)";
		String pattern4 = "\\d,\\d{3}\\원";
				
		Matcher m  = Pattern.compile(pattern).matcher(str);
		Matcher m2  = Pattern.compile(pattern2).matcher(str);
		Matcher m3  = Pattern.compile(pattern3).matcher(str);
		Matcher m4  = Pattern.compile(pattern4).matcher(str);
		
		if(m.find()&&m2.find()&&m3.find()&&m4.find()) {
			System.out.println("상품번호 : "+m.group());
			System.out.println("편의점이름 : "+m2.group());
			System.out.println("도시락명 : "+m3.group());
			System.out.println("가격 : "+m4.group());
		}
	}
}
