package day27.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegixEx02 {
	public static void main(String[] args) {
		/*
		 * 많이 사용되는 정규 표현형식들
		 * \\w 영문자와 숫자
		 * \\w+ 영문자와 숫자 1회이상
		 * \\d 숫자만
		 * \\d+ 숫자 여러개
		 * \\d{n} 숫자 n개
		 * \\d{n, m} 숫자 n~m개
		 * [n~m] n~m사이의 문자를  1개 찾음 p.s) 0~9, a~z, A~Z, 가~힣
		 * [n~m]+ n~m사이의 문자 중 여러개
		 * [n~m]{k} n~m사이의 문자중 k개를 찾음
		 */
		
		String info="30세/서울시 강남구/02-123-3452/010-1234-5678/kkk@naver.com";
		
		//전화번호 형식
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		//정규표현 엔진생성
		Pattern p  = Pattern.compile(pattern);
		//2. 정규표현엔진 적용
		Matcher m=p.matcher(info);
		
		System.out.println(m.find());
		
		while(m.find()) {
			System.out.println("찾은 인덱스의 위치 : "+m.start());
			System.out.println("끝 인덱스의 위치 : "+m.end());
			System.out.println("추출 : "+m.group());
		}
		//이메일의 형식 정규표현식 메타문자에 포합되지 않은 글자 or특수문자를 그대로사용
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2  = Pattern.compile(pattern2).matcher(info);;
		
		
		System.out.println(m2.find());
		
		while(m2.find()) {
			System.out.println("찾은 인덱스의 위치 : "+m2.start());
			System.out.println("끝 인덱스의 위치 : "+m2.end());
			System.out.println("추출 : "+m2.group());
		}
		
	}
}
