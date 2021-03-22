package encap.bad;

public class MainClass {
	public static void main(String[] args) {
		//맴버변수가 public으로 선언되면 잘못된 값이 저장되거나 누구든지 사용이 가능해진다.
		MyBirth me = new MyBirth();
		me.year = 2020;
		me.month = 8;
		me.day = 17;
		me.ssn = "이게뭐죠?";
		
		me.info();
	}
}
