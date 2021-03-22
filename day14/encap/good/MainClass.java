package encap.good;

public class MainClass {
	public static void main(String[] args) {
		//맴버변수가 public으로 선언되면 잘못된 값이 저장되거나 누구든지 사용이 가능해진다.
		MyBirth me = new MyBirth();
		
		me.setYear(2021);
		me.setMonth(7);
		me.seDay(24);
		me.setSsn("1234567890123");
		System.out.println(me.getYear());
		System.out.println(me.getMonth());
		System.out.println(me.getDay());
		System.out.println(me.getSsn());
	}
}
