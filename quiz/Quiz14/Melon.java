package Quiz14;

import java.util.Arrays;

public class Melon implements SongList {
	
	//맴버변수
	private String[] list = new String[100];
	private int count = 0;
	/*
	 * insertList는 list배열에 매개변수를 순서대로 저장.
	 * playList는 배열안에 음악을 랜덤하게 출력.
	 * playLength는 음악의 갯수를 반환
	 */
	
	@Override
	public void insertList(String song) {
		list[count]=song;
		count++;		
	}
	@Override
	public void playList() {
		int[] play = new int[count];
		for (int i = 0; i < count; i++) {
			int ran = (int) (Math.random() * count);
			play[i] = ran;
			for (int j = 0; j < i; j++) {
				if (play[i] == play[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(list[play[i]]+"을(를) 재생합니다.");
		}
	}
	@Override
	public int playLength() {
		return count;
	}


}
