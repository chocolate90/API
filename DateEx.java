package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		// 날짜 클래스
		Date date = new Date(); // import 유틸 패키지
		
		// 날짜 포멧클래스
		/*
		 * MM - 월
		 * mm - 분
		 * 
		 * HH - 24시 형식으로
		 * hh - 12시 형식으로
		 */
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy년 MM월 dd일 hh시  mm분 ss초");
		String result = sim.format(date);
		
		System.out.println(result);
		
		sim = new SimpleDateFormat("yyyyMMdd");
		
		String result1 = sim.format(date);
		
		System.out.println(result1);
		
	}
}
