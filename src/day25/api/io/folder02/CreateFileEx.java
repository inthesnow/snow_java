package day25.api.io.folder02;

import java.io.File;

public class CreateFileEx {
	public static void main(String[] args) {
		//폴더를 생성하는 방법, File클래스를 이용
		try {
			File file = new File("C:\\Users\\user\\Desktop\\exFile\\Filetest");
			
			if (!(file.exists())) {//파일이 존재하면 트루 없으면 팰즈
				file.mkdir();
				System.out.println("폴더 생성 성공");
			}else {
				System.out.println("해당 폴더가 이미 존재");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
