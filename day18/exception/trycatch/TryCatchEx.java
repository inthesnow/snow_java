package exception.trycatch;

public class TryCatchEx {
	public static void main(String[] args) {
		int i =10;
		int j =0;
		
		System.out.println(i+j);
		try { //시도해보는문장
			System.out.println(i/j);
		} catch (Exception e) { //try파트에 오류가 있을시
			System.out.println("0으로 나눌수없다");
		} finally { //안써도 되지만 쓰면 무조건 실행.
			
		}
		
		System.out.println(i*j);
		
	}
}
