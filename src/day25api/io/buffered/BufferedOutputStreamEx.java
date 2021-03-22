package day25api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws IOException {
		/*
		 * Buffered가 붙은 클래스는 입출력 성능향상을 위한 클래스 이며, OutputStream은 바이트 기반이다.
		 * 
		 * Buffered는 생성자의 매개 변수로 입출력 클래스를 전달 받는다.
		 */
		Scanner s = new Scanner(System.in);
		
		OutputStream fos;
		BufferedOutputStream bf = null;

		try {
//			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\exFile\\test2.txt");
//			bf = new BufferedOutputStream(fos);

			bf = new BufferedOutputStream(new FileOutputStream("C:\\Users\\user\\Desktop\\exFile\\test2.txt"));
			
			System.out.print("입력할 문장 > ");
			String str = s.nextLine();
			
			bf.write( str.getBytes() );
			bf.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
			bf.close();
			s.close();
			} catch (Exception e2) {

			}
		}
		
	}
}
