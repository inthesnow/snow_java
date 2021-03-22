package day09;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//학생정보를 저장하는 배열 4개
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		
		//현재 사람수가 몇명이 저장되어있는지 알기 위한 변수
		int count = 0;
		//index(위치)를 조정하기 위한 변수
		int index = -1;
		
		esc:while(true) {
			System.out.println("[info]고객수:" + count + ",현재위치:" + index);
			System.out.println("[menu](i).Insert, (p)Prev, (n)Next,(c)Current, (u)update, (d)Delete,(q)Quit");
			System.out.printf("메뉴>");
			String menu = scan.next();
			
			switch(menu) {
			
			case "i":
				System.out.println("========고객정보 입력=========");
				/*
				 * 이름, 성별, 나이를 입력받아서-- 배열에 순서대로 저장
				 * 사람수 증가--
				 */
				System.out.print("이름:");
				String name = scan.next();
				System.out.print("성별:");
				String gender = scan.next();
				System.out.print("나이:");
				int age = scan.nextInt();
				
				nameList[count] = name;
				genderList[count] = gender;
				ageList[count] = age;
			
				count++;
				
				System.out.println();
				System.out.println("=======================");
				break;
			case "p":
				System.out.println("============이전고객정보============");
				/*
				 * index번호가 0이하면 "이전 정보가 없습니다" 출력  
				 * 그렇지 않으면 index를 이동해서 이전고객정보를 보여주면 됩니다
				 */			
				if(index < 0 ) {
					System.out.println("이전 정보가 없습니다");
					
				}else {
					index--;
					System.out.println(nameList[index] + genderList[index] + ageList[index]);
				}
					
				
				System.out.println("================================");
				break;
			case "n":
				System.out.println("===========다음고객정보==========");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 고려해서 "다음정보가 없습니다" 출력
				 * (index와 count와 연관이 있습니다)
				 * 그렇지 않으면 index를 이동하고 다음 고객정보를 보여주면 됩니다
				 */
				if(index+1 >= count ) {
					System.out.println("다음정보가 없습니다");
					
				}else {
					index++;
					System.out.println(nameList[index] + genderList[index] + ageList[index]);
				}
					
				
				System.out.println("==================");
				break;
			case "c":
				System.out.println("==========현재고개정보==========");
				/*
				 * 현재 고객정보를 출력할 수 있는 조건을 고려해서 현재정보를 출력해주면 됩니다
				 * 힌트) index는 ??보다 커야하고 ??보다 작아야됩니다
				 * 
				 */
				System.out.println(nameList[index] + genderList[index] + ageList[index]); 
				
				
				
				System.out.println("===================");
				break;
			case "u":
				System.out.println("======현재 고객 정보 수정======");
				/*
				 * 현재 고객정보를 출력할 수 있는 조건을 고려해서 스캐너를 통해 이름,성별,나이를 받고 수정해주면 됩니다
				 */
				System.out.print("이름:");
				 name = scan.next();
				System.out.print("성별:");
				 gender = scan.next();
				System.out.print("나이:");
				 age = scan.nextInt();
				
				nameList[index] = name;
				genderList[index] = gender;
				ageList[index] = age;
				System.out.println("=======================");
				break;
			case "d":
				System.out.println("============현재 고객정보 삭제============");
				/*
				 * 현재 고객정보를 삭제할 수 있는 조건을 고려해서 현재 위치보다 뒤에있는 배열요소를 당겨와서 덮어 씌웁니다.
				 */
				
				for(int i =0; i <= count; i++) {
					
					if(i == index) {
						//현재위치에서 count-1미만 인덱스까지 요소를 당겨온다.
					
					for(int j=1; j < count-1; j++) {
						nameList [j] = nameList[j+1];
						genderList [j] = genderList[j+1];
						ageList[j] = ageList[j+1];
					}
					count--; //접근할 index
					}
				}
				
			
				System.out.println("=====================");
				break;
			case "q":
				//while문을 탈출시키고 종료
				System.out.println("프로그램을 종료합니다");
				break esc;
			default :
				System.out.println("메뉴를 잘못 입력하셧습니다");
				break;
			}
		}
	}
}
