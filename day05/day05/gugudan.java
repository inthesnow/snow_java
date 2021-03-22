package day05;

public class gugudan {
	public static void main(String[] args) {
		int x=1;
		
		while(x<10) {
			int y=1;
			int num2=x*y;
			
			while(y<=9) {
				int num=x*y;
				System.out.println(x+"x"+y+"="+num);
				y++;
			}		
			System.out.println(x+"x"+y+"="+num2);
			x++;
		}
	}
}
