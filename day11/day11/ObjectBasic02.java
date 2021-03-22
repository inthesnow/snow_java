package day11;

public class ObjectBasic02 {
	public static void main(String[] args) {
		
	Calculator cal = new Calculator();
	
	System.out.println("1번계산기로 계산");
	System.out.println( cal.add(1) );
	System.out.println( cal.add(2) );
	System.out.println( cal.add(3) );
	
	Calculator cal2 = new Calculator();
	System.out.println("2번계산기로 계산");
	System.out.println( cal2.add(10) );
	System.out.println( cal2.add(20) );
	System.out.println( cal2.add(30) );
	
	}
}
