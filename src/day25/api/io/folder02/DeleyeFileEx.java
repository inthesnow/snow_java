package day25.api.io.folder02;

import java.io.File;

public class DeleyeFileEx {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\user\\Desktop\\exFile\\Filetest");
			
			if (!(file.exists())) {//파일이 존재하면 트루 없으면 팰즈
				file.delete();
				System.out.println("폴더 석제 성공");
			}else {
				System.out.println("삭제할 폴덛가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
