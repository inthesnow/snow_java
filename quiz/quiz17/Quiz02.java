package quiz17;

import java.util.Arrays;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 출처 : 프로그래머스
		 * participant는 마라톤 참가자 명단입니다.
		 * completion은 마라톤 완주자 명단입니다.
		 * 
		 * completion은 participant의 길이보다 -1이 적습니다.
		 * 참가자는 동일인물이 있을 수 있습니다.
		 * 어떤 배열이 주어지던 간에 마라톤을 완주하지 못한 이름(String)을 찾아 내는 매서드를 작성하세요.
		 */
		String[] participant = {"홍길동","홍길자", "이순신","신사임당","체력고갈"};
		String[] completion = {"홍길동","홍길자", "신사임당","이순신"};
	
		System.out.println("완주하지 못한 닝겐 : "+solution(participant, completion));
	}

	static String solution(String[] p, String[] c) {
		Arrays.sort(p);
		Arrays.sort(c);
		String person ="";
			for (int i = 0; i < c.length; i++) {
				if (c[i].equals(p[i]) != true) {
					int index = Arrays.binarySearch(p, p[i]);
					person = p[i];
					for (int j = i; j < p.length - 1; j++) {
						p[j] = p[j + 1];
					}
					p = Arrays.copyOf(p, p.length - 1);
					i--;
				}
			}
			if (person=="") person = p[p.length-1];
		return person;
	}
	
	
}
