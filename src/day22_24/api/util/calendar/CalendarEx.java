package day22_24.api.util.calendar;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		//calendar는 일반적인 객체 생성이 안됩니다. (싱클톤)
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(sec);
		
	}

}
