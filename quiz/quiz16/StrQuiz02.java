package quiz16;

import java.util.Scanner;

public class StrQuiz02 {
	public static void main(String[] args) {
		/*
		 * 주민등록 번호 13자리를 입력 받습니다.
		 * 주민번호는 - 포함해서 받을 수도 있습니다.
		 * 13자리가 아니라면 다시 입력 받습니다.
		 * 남자or여자 인지 구분해서 출력해주면됩니다.
		 */
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("주민등록 번호를 입력해줏메");
			System.out.print(">");
			String rnn = s.next();
			String rrn=rnn.replace("-", "");
			if(rrn.length()!=13) {
				System.out.println("13자리가 아니야 임마");
			} else {
				char sex = rrn.charAt(6);
				if (sex == '1'|| sex == '3') {
					System.out.println("male");
					break;
				} else if  (sex=='2' || sex == '4') {
					System.out.println("female");
					break;
				} else {
					System.out.println("옳바른 형식이 아닙니다.");
				}
			}

		
		
		}
	}
}
