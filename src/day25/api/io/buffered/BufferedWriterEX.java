package day25.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEX {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\exFile\\test3.txt"));
			
			System.out.print(" > ");
			String str1 = s.nextLine();
			System.out.print(" > ");
			String str2 = s.nextLine();
			
			bw.write(str1+"\r\n"+str2);//파일을 쓴다.
			bw.flush();//버퍼를 비운다.
		
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
