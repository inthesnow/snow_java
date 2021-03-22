package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//날씨클래스
		Date date = new Date();
		System.out.println(date);
		
		//심플데이트 포멧
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년mm월dd일hh시mm분ss초");
		/*
		 * yyyy- 년, mm월,dd일, HH24시간형식,hh12시간형식
		 */
		String result = sdf.format(date);
		System.out.println(result);
		
		sdf = new SimpleDateFormat("yyyyMMdd");
		result = sdf.format(date);
		System.out.println(result);
		
	}
}
