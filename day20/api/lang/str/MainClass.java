package api.lang.str;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
	String str = new String("hi");
	
	String str2 = "Hello";
	System.out.println("문자열의 길이 :" + str.length());
	System.out.println("H가 있는 위치(앞에서부터) : "+str.indexOf("H"));
	System.out.println("H가 있는 위치(뒤에서부터) : "+str.lastIndexOf("H"));
	
	//char c=str2.charAt('1');
	//System.out.println(c);
	
	//replace = 특정문자변경(중요)
	String str3 = "자바는 재밌습니까? 자바는 커피집이름인데 말이죸ㅋ";
	System.out.println(str3.replace("자바", "java"));
	
	//replace를 이용한 공백제거
	System.out.println(str3.replace(" ", ""));
	//substring - 문자열자르기
	String str4 = "123123-4567890";
	System.out.println(str4.substring(7));//매가값을 1개주면 앞문자열 삭제
	System.out.println(str4.substring(7, str4.length()));
	
	//toUpperCase, toLowerCase = 대소문자로 변경
	String str5 = "hello world";
	System.out.println(str5.toUpperCase());
	System.out.println(str5.toLowerCase());
	
	str5 = "     홍길 동";
	System.out.println(str5);
	System.out.println(str5.trim());//앞뒤 공백제거
	
	//valueOf = 숫자를 문자로 변경
	int a=1, b=2;
	System.out.println(String.valueOf(a)+String.valueOf(b));
	
	//split - 문자열 자르기 (특정문자기준)
	String str6 = "010-1234-5678";
	String[] arr = str6.split("-");
	System.out.println(Arrays.toString(arr));
	
	String[] arr2 = str6.split("-", 2); //잘린배열의 최대크기 2
	System.out.println(Arrays.toString(arr2));
	
	//contains - 특정문자가 포함되어있다면 true
	String str7 = "우리집 강아지 이름은 ? 강아지가 없는데?ㅋ";
	if(str7.contains("강아지")) {
		System.err.println("강아지라는 단어가 있네용~");
	}
	
	}
}
