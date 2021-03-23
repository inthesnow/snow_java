package day25.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.plaf.basic.BasicBorders.FieldBorder;

public class BufferedReader_UTF8 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader is = null;
		BufferedReader br = null;

		try {
			fis = new FileInputStream("D:\\snow_java\\exFolder\\test4.txt");
			is = new InputStreamReader(fis, "EUC-KR");//첫번째 매개변수 inputStream, 디코딩형식
			br = new BufferedReader(is);
			
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
				is.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
	
	}
}
