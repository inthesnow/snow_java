package day04;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고있는 기능을 사용해서 데이터를 받음
		System.out.printf("이름 : ");
		String name = scan.next(); //스캐너가 받은 데이터를 스트링 타입의 네임변수에 저장
		
		System.out.printf("나이 : ");
		int age = scan.nextInt();
		
		System.out.printf("키 : ");
		double cm = scan.nextDouble();
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("신장은 : " + cm);
	}
}
