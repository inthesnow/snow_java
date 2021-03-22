	package day25.api.io.stream01;

import java.io.FileInputStream;

public class InputStreamEx01 {
	public static void main(String[] args) {
		/*
		 * 1. 파일을 바이트단위로 일긍ㄹ 때 사용하는 클래스
		 * 2. 생성자 매개변수로 읽어들일 파일의 경로
		 */
		
		
		try {
			FileInputStream fis = new FileInputStream("c:\\Users\\user\\Desktop\\금토일");
			
			//1버아투 단위로 읽기
			int result =fis.read();
			while(true) {
				if(result==-1) break;
				System.out.println(((char)result));
			}
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
}
