package api.util.calendar;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		// Calendar는 일반적인 객체 생성이 안된다. (싱글톤)
	
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get( Calendar.YEAR );
		
		System.out.println(year);
		
		int month = cal.get( Calendar.MONTH ) + 1;
		
		System.out.println(month);
		
		int day = cal.get( Calendar.DATE );
		
		System.out.println(day);
		
		int hour = cal.get( Calendar.HOUR );
		
		int minute = cal.get( Calendar.MINUTE );
		
		int second = cal.get( Calendar.SECOND );
		
		System.out.println(hour + "시" + minute + "분" + second + "초");
		
	}
	
}
