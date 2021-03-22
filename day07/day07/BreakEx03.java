package day07;

public class BreakEx03 {
	public static void main(String[] args) {
		
		//중첩 반복문의 탈출
		boolean flag = false;
		
		for(char u='A'; u<= 'Z'; u++) {
			for(char l='a'; l<='z'; l++) {
				System.out.println(u+"-"+l);
				if(l=='c') {
					flag = true;
					break;
				}
			}
			if (flag == true) break;
		}
		
		//laber을 이용한 탈출
		es : for(char u='A'; u<= 'Z'; u++) {
			for(char l='a'; l<='z'; l++) {
				System.out.println(u+"-"+l);
				if(l=='c') break es;
			}
		}
	}
}
