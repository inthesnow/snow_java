package Quiz;

public class Quiz09 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "%#$"};
		/*
		 * 랜덤값을 이용해서 0~3까지 랜덤수를 발생시켜주세요
		 * 나오는 랜덤수를 배열의 index에 적용해서, 선택된 단어가 어느나라 말인지 출력해주세요
		*/
		
		int r = (int)(Math.random()*4);
		
		switch (r) {
		case 0:
			System.out.println(arr[r] + "은 한국어 입니다.");
			break;
		case 1:
			System.out.println(arr[r] + "은 영어 입니다.");
			break;
		case 2:
			System.out.println(arr[r] + "은 일어 입니다.");
			break;
		case 3:
			System.out.println(arr[r] + "은 외계어 입니다.");
			break;

		default:
			break;
		}
		
	}
}
