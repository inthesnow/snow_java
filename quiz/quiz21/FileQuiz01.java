package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {
	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용해서 파일명을 정확히 입력 받습니다.
		 * 
		 * 2. file폴더에 해당파일을 저장해주세요
		 * 
		 * 3. file폴더에 저장된 파일을 filecopy폴더로 복사하세요
		 * 
		 * 4. 파일명이 없는 경우 대한 예외처리, 복사도중 발생하는 예외처리는 2가지로 처리해주세요
		 * 
		 */
		Scanner s = new Scanner(System.in);
		System.out.print( "정확한 파일명을 입력해주세요 > ");
		String name = s.nextLine();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("경로"+name);
			
			fos = new FileOutputStream("경로"+name);
			
			byte[] arr = new byte[100];
			int result;
			while((result=fis.read(arr))!=-1) {
				fos.write(arr, 0, result);//파일을쓴다.
			}
			System.out.println("파일복사 성공");
		} catch (FileNotFoundException e) {
			System.out.println(name + "파일을 찾을 수 없습니다.");
		} catch (IOException o) {
			System.out.println("파일 처리도중 에러가 발생하였습니다.");
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
