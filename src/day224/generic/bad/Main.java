package day224.generic.bad;

public class Main {
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.setObj("name");//저장
		String name = (String)abc.getObj();
		System.out.println(name);
		
		abc.setObj(new DEF());
		DEF def = (DEF)abc.getObj();
	}
}
