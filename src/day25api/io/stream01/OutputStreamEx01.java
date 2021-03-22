package day25api.io.stream01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamEx01 {
	public static void main(String[] args) {
		/*
		 * OutpuStream은 byte(1바이트) 기반 출력스트림
		 * 1.FileOutputStream은 파일을 쓸때 사용하는 클래스
		 * 
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("파일명 > ");
		String name = s.next();
		try { 
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\exFile"+name);
			
			System.out.println("문장을 입력해주세요 > ");
			s.nextLine(); //next다음에 nextLine을 쓰면 그냥넘어감...
			String str = s.nextLine();
			
			byte[] arr = str.getBytes();
			fos.write(arr);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//fos.close();
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}
