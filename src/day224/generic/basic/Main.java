package day224.generic.basic;

public class Main {
	public static void main(String[] args) {
		Basic<Integer, String> b = new Basic<>();
		
		b.set(1,"뜨뜨링");
		String name = b.get(1);
		System.out.println(name);
		
		System.out.println(b.toString());
	}
}
