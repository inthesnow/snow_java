package api.lang.obj;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Object클래서의 기능
		 * -equals-객체의 주소값이 같다면 true
		 * -toString-주소값을 문자열로 반환
		 * -finalize-객체가 소멸될때 호출(그시점은 알수없음)
		 */
		
		Person hong = new Person("홍길동");
		System.out.println(hong.equals(hong));
		
		Person kim = new Person("홍길동");
		System.out.println(kim.toString());
		
		hong = null;
		System.gc();//gc를 호출 > 쓰래기값을 호출하여 내용을 교체
		
		try {
			Person p = (Person)kim.clone();
			System.out.println("clone from kim : " +p.getName());
			System.out.println(p==kim);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
}
