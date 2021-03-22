package day25api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReaderEx {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\exFile\\test3.txt"));
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
