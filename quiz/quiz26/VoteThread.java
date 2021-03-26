package quiz26;

import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class VoteThread implements Runnable{
	/*
	 * 쓰레드 객체는 3개가 생성되어야 합니다.
	 * run()메서드에서는 랜덤값을 이용해서 각 구의 개표진행사항을 화면에 출력합니다. 
	 * stringbuffer를 이용해서 출력
	 * 
	 * 조건 : 개표율이 100%를 넘지않는다.
	 */
	Random ran = new Random();
	int num = 0;
	StringBuffer vote = new StringBuffer();
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		while (true) {
			int r = ran.nextInt(10) + 1;
			num += r;

			if (num >= 100) {
				vote.delete(0, num);
				num=100;
				for (int i = 0; i < num; i++) {
					vote.append("*");
				}
				System.out.println(name + "(" + num + "%)" + vote);
				System.out.println(name+"의 개표가 완료되었습니다.");
				break;
			}
			for (int i = 0; i < r; i++) {
				vote.append("*");
			}

			System.out.println(name + "(" + num + "%)" + vote);
		}

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
