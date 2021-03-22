package day25api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferedInputStreamEx {
	public static void main(String[] args) {
		/*
		 * BufferedInputString은 바이트 기반이기때문에 문자를 쓰기에 적절하지않다.
		 */
		
		
		BufferedInputStream bf =null;
		
		
		try {
			bf = new BufferedInputStream(new FileInputStream("C:\\Users\\user\\Desktop\\exFile\\test2.txt"));
			
			while(true) {			
			int result = bf.read();
			if (result==-1) break;
			System.out.print((char)result );
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bf.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
