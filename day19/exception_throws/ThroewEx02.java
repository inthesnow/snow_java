package exception_throws;

public class ThroewEx02 {
	public void aaa(int num) throws Exception{
		System.out.println("aaa call");		
//		try {			
			System.out.println(10/num);
//		} catch (Exception e) {
//			System.out.println("0으로 나눌수없습니다");
//		}
		System.out.println("aaa end");
	}
	public void bbb() throws Exception {
		System.out.println("bbb call");
		aaa(0);			
		System.out.println("bbb end");
	}
	//생성자
	public ThroewEx02()  throws Exception{
		System.out.println("생성자 호출");
		bbb();
		System.out.println("생성자 종료");
	}
}
