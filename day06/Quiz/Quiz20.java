package Quiz;

public class Quiz20 {
	public static void main(String[] args) {
		//구구단 2~9단 까지 세로로 출력.
		for(int i=2; i<10 ; i++) {
			System.out.println("구구단 : "+i+"단");
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		}
		System.out.println("-------------------------");
		//줄맞춤 - 서식문자 \t
		//8칸 띄어쓰기
		
		for(int i=1; i<10 ; i+=3) {
			System.out.print("\n");
			for(int j=1 ; j<10 ; j++) {
				System.out.println(i + "x" + j + "=" + i*j
				+ "\t" + (i+1) + "x" + j + "=" + (i+1)*j
				+ "\t" + (i+2) + "x" + j + "=" + (i+2)*j);
				
				//System.out.printf("%d x %d = %d\t %d x %d = %d\t %dx %d = %d\t\n"
				//		,i, j, i*j, i+1, j,(i+1)*j,i+2,j,(i+2)*j);
			}
		}
	}
}
