package day03;

public class OperatorEx01 {
	public static void main(String[] args) {
		
		//단항 연산자
		//부호 연산자 +, -
		
		int i = +3;
		int j = -i;
		
		int k = 1;
		int h = k++;//후위 연산자 : 값을 대입 후 1증가
		
		System.out.println(k);
		System.out.println(h);
		
		int x = 1;
		int y = ++x; //전위 연산자 : 먼저 값을 증가, 그 다음 저장
		
		System.out.println(x);
		System.out.println(y);
		
		//일반적인 표현
		x=1;
		++x;
		x++;
		
		x = 1;
		y = 1;
		
		System.out.println(x++);// 1인 상태에서 출력후 값이 1증가
		System.out.println(++x);// 2가 된상태에서 1증가
		
		x = 10;
		y = 10;
		
		int result = x++ + ++y + 10;
		System.out.println(result);
		
		//예외상황
		x=10;
		y=10;
		
		int result2 = x++ + x++ + x++; // 같은 항에 후위연산자 반복시 차수에 증가에 따라 미리 적용됨
		System.out.println(result2);
		
		byte b = 10; //0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1);
		System.out.println(~( ~b + 1 ) + 1 );
		
		boolean bool1 = true;
		System.out.println(!bool1);
		System.out.println(!false);
		
		
		
	}
}
