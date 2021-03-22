package quiz18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.
		 * 
		 * 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		 * 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		 * 
		 * 6. list에 "홍길동" 이 있다면 객체를 삭제.   
		 */
	//1
		//make User class
	//2
		List<User> user = new ArrayList<>();
		User u1 = new User("홍길동", 18);
		User u2 = new User("홍길자", 16);
	//3
		user.add(u1);
		user.add(u2);
	//4
		System.out.println("일반 포문");
		for(int i=0; i<user.size();i++) {
			System.out.print(user.get(i)+" ");
		}
		System.out.println("\n향상된 포문");
		for(User i:user) {
			System.out.print(i+" ");
		}
	//5
		System.out.println();
		for(User i:user) {
			if(i.getName().equals("홍길자")) {
				System.out.println(i.toString());
			} else if(i.getName().equals("홍길동")) { //6
				System.out.println(i+"를 삭제했습니다.");
				user.remove(i);
			}
		}
		System.out.println(user.toString());
		
	}
}
