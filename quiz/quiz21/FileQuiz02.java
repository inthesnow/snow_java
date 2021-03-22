package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {
	public static void main(String[] args) {
		/*
		 * 1. data 클래스 이용해서 file폴더경로에 오늘날짜 ex)20210322.txt이름으로 파일을 씁니다.
		 * 2. 내용은 아무거나 작성하세요
		 * 3.파일을 정상적으로 썻다면 bufferdReader를 통해서 읽어들이세요
		 */
		Scanner s = new Scanner(System.in);
		
		Date today = new Date();
		System.out.println(today);
		String name = today.toString();
		
		OutputStream file = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			file = new FileOutputStream("C:\\User\\user"+name+".txt");
			
			System.out.println(" > ");
			String str = s.nextLine();
			
			bw = new BufferedWriter(new FileWriter("C:\\User\\user"+name+".txt"));
			bw.write(str);
			bw.flush();
			
			br = new BufferedReader(new FileReader("C:\\User\\user"+name+".txt"));
			while(br.readLine()!=null) {
				System.out.println(br.readLine());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
