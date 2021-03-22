package api.lang.sb;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(str);
		System.out.println(sb);
		
		str = str +" program";
		sb.append(" program");

		System.out.println(str);
		System.out.println(sb);
		
		sb.append(" stuby");
		System.out.println(sb);
		
		sb.insert(12, "ming");
		System.out.println(sb);
		
		sb.delete(5, 17);
		System.out.println(sb);
		
		sb.replace(5, 10, "book");
		System.out.println(sb);

		//문자열을 거꾸로
		sb.reverse();
		System.out.println(sb);
	}
}
