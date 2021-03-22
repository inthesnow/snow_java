package day25api.io.rw03;

import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때, 사용하는 클래스는 FileWriter클래스입니다.
		 * 기본적으로 2byte단위로 문자를 읽고 쓰기 때문에 문자쓰기에 적합.
		 */
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Users\\user\\Desktop\\exFile\\test.txt");
			
			while(true) {
				int result = fr.read();
				if(result==-1) break;
				System.out.print((char)result);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
