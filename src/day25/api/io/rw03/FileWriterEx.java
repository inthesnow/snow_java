package day25.api.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {
	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때, 사용하는 클래스는 FileWriter클래스입니다.
		 * 기본적으로 2byte단위로 문자를 읽고 쓰기 때문에 문자쓰기에 적합.
		 */
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\user\\Desktop\\exFile\\test.txt");
			
			String str = "굳이 이렇게 따로 선언을 하고 넣어야하나,,,\r\n개피곤하네";//\n은 줄바꿈,\r캐리지 리턴(글자를 처음으로 정렬)
			fw.write("test file");//write메서드는 문자열 자체를 받아줍니다.
			fw.write(str);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
