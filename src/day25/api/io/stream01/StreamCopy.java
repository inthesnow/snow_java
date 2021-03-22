package day25.api.io.stream01;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopy {
	public static void main(String[] args) {	
		//파일 복사로 옮기기
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//읽어드릴경우
			fis = new FileInputStream("경로");
			
			//복사할 경우
			fos = new FileOutputStream("경로");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
