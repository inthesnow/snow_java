package static_basic;

public class ArrayPrint {
	
	//Arrays.toString()처럼 사용될 수 있도락 각각 메서드를 처리
	//외부에서 객체생성을 할수없도록 처리
	public static String printArray(String[] arr) {
		
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length -1) break;
			result += ", ";
		}
		result += "]";
		return result;
	}
	
	public static String printArray(int[] arr) {

		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length -1) break;
			result += ", ";
		}
		result += "]";
		return result;
	}
	
	public static String printArray(double[] arr) {

		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
			if(i == arr.length -1) break;
			result += ", ";
		}
		result += "]";
		return result;
	}
	
	
	
	
	public void test(String ar) {
		System.out.println(ar);
		ar = "가나다";
	}
	
	public void test(String[] ar) {
		System.out.println(ar);
		ar[0] = "가나다";
	}
	
	
	
	
	
	
	
	
	
}
