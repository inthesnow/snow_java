package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class FileQuiz93 {
	/*
	 * 1.Date클래스를 이용 file 경로에 오늘날짜 20210323file 폴더를 생성
	 * 2. 파일명을 입력받고 파일명.txt파일로 파일을 만든다.
	 * 3. exit를 입력받을 때 까지 엔터 포함 실시간으로 파일을 씁니다.
	 * 4. exit로 파일이 써졌다면, 아무방법으로나 파일을 읽으세요
	 */
	
	public static void main(String[] args) throws IOException {
		
		Scanner s =new Scanner(System.in);
		SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd");
		Calendar to = Calendar.getInstance();
		String today = form.format(to.getTime());
		
		File folder = new File("D:\\snow_java\\exFolder\\"+today+"file");

		BufferedWriter bw = null;
		BufferedReader br = null;
		
		if (!folder.exists()) {

			try {
				folder.mkdir();
				System.out.println("폴더가 생상되었습니다.");

				System.out.print("파일이름 > ");
				String fileName = s.next();

				bw = new BufferedWriter(new FileWriter(folder.getPath()+"\\"+fileName+".txt"));
				
				System.out.print(">");
				while(true) {
					String str = s.nextLine();
					if(str.equals("exit")) break;
					bw.write(str+"\n\r");
					bw.flush();
				}
				System.out.println("저장 완료");
				
				br = new BufferedReader(new InputStreamReader(new FileInputStream(folder.getPath()+"\\"+fileName+".txt"), "UTF-8"));
				
				while(br.readLine()!=null) {
					System.out.println(br.readLine());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {					
					bw.close();
					br.close();
					s.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}else {
			System.out.println("이미 폴더가 존재합니다.");
		}
		
		
	}
}
