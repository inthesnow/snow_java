package encap.good;

public class MyBirth {
	private int year;
	private int month;
	private int day;
	private String ssn;//주민번호.
	
	/*
	 * 은닉 변수에 접근할 때는 클래스 설계자가 미리 생성해 놓은
	 * getter/setter메서드를 사용합니다.
	 * 
	 * setter메서드
	 * 1. 은닉변수의 값을 저장하는 용도
	 * 2. 접근제어자는 public으로 선언하고 이름이 set+맴버변수명으로 지정
	 */
	
	public void setYear(int year) {
		//ex) 1950~2021로 범위 지정
		if(year<1950||year>2021) {
			System.out.println("년도는 1950~2021만 저장됩니다.");
		} else {
			this.year = year;
		}
	}
	/*
	 * getter메서드의 선언
	 * 1. 은닉변수에 값을 조화하는 용도
	 * 2. 접근제어자는 public으로 선언하고 이름은 get+맴버변수명
	 */
	public int getYear() {
		return year;
	}
	
	/*
	 * 1. month, dat, ssn에 getter, setter생성
	 * month = 1~12월까지만 생성
	 * day - 1~31일까지만 저장
	 * ssn - 13자리까지만 저장가능 문자열.length()
	 */

	public void setMonth(int month) {
		if(month<1||month>12) {
			System.out.println("월은 1~12만 저장됩니다.");
		} else {
			this.month = month;
		}
	}
	public int getMonth() {
		return month;
	}
	
	public void seDay(int day) {
		if(day<1||day>31) {
			System.out.println("을은 1~31만 저장됩니다.");
		} else {
			this.day = day;
		}
	}
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if(ssn.length()!=13) {
			System.out.println("잘못된 형식의 주민 등록번호입니다.");
		} else {
			this.ssn = ssn;
		}
	}
	public String getSsn() {
		return ssn;
	}
}
