package day13;

public class ArrayPrint {
	
	String printArray(String[] arr) {
		String result = "[";
		for(int i=0; i<arr.length;i++) {
			result+=arr[i];
			if(i==arr.length-1) break;
			result+=", ";
		}
		result +="]";
		return result;
	}
	String printArray(int[] arr) {
		String result = "[";
		for(int i=0; i<arr.length;i++) {
			result+=arr[i];
			if(i==arr.length-1) break;
			result+=", ";
		}
		result +="]";
		return result;
	}
	String printArray(double[] arr) {
		String result = "[";
		for(int i=0; i<arr.length;i++) {
			result+=arr[i];
			if(i==arr.length-1) break;
			result+=", ";
		}
		result +="]";
		return result;
	}
	
	void test(String ar) {
		System.out.println(ar);
		ar="가나다";
	}
	void test(String[] ar) {
		System.out.println(ar);
		ar[0]="가나다";
	}
}
