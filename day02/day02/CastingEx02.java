package day02;

public class CastingEx02 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입에 저장할 때는 (Type) 캐스팅을 사용해
		 * 명시적 형변환을해야합니다.
		 */
		
		int i = 65;
		char c = (char)i;
		short s = (short)i;
		
		System.out.println(c);
		System.out.println(s);
		
		float f = 3.14f;
		int j = (int)f;
		
		System.out.println(j);
		
		/*
		 * 강제 타입변환시에 주의할점은 값을 받아드릴 수 없는 범위가 들어오면
		 * 잘려나간 쓰레기 값을 저장하게 됩니다.
		 */
		
		int a = 1000;
		byte b = (byte)a;
		
		System.out.println(b);

		/*
		 * 예외상황 char값을 short형으로 변경할 때
		 * 명시적으로 형변환을 해야합니다.
		 */
		char cc = 'a';
		//short ss = cc; < 이건 안됨
		short ss = (short)cc;
	}
}
