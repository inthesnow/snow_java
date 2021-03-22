package day03;

public class CastingEx03 {
	public static void main(String[] args) {
		
		char c = 'A';
		int i = 2;
		
		char cc = (char)(c + i); //연산의 우선 순위를 확인하고 캐스팅(형변환)한다.
		int ii = c + i;
		
		System.out.println(cc);

		int j = 10;
		double d = 3.14;
		
		double dd = j + d;
		int jj = j + (int)d;
		
		System.out.println(dd);
		
		byte b1 = 100;
		byte b2 = 12;
		
		byte b3 = (byte)(b1 + b2);
		
		
		System.out.println(b3);
		
		byte b4 = 10;
		short s1 = 100;
		
		short ss = (short)(b4 + s1);
		
		System.out.println(ss);
		
		
		
	
	}
}
