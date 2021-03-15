package api.lang.str;

import java.util.Arrays;

public class StrMain {

	public static void main(String[] args) {
		
		/*
		
		char[] arr = {'안', '녕', '하', '세', '요', '~'};
		
		String str1 = new String(arr);
		
		String str2 = new String("안녕하세요~");
		
		System.out.println(str1);
		System.out.println(str2);
		*/
		
		// length - 문자열 길이
		String str = "안녕하세요";
		System.out.println(str.length());
		
		// charAt - 문자열을 인덱스 번호 1글자 자르기
		
		char c = str.charAt(2);
		
		System.out.println(c);
		
		// indexof - 문자열을 찾아서 위치 인덱스 반환
		int i1 = str.indexOf("안녕");
		System.out.println("'안' 이 있는 위치: " + i1 );
		
		int i2 = str.lastIndexOf("안녕");
		System.out.println("'안' 이 있는 위치: " + i2 );
		
		// replace - 특정 문자 변경(중요)
		String str1 = "자바는 재밌습니까? 자바는 커피집 이름인데 말이죸ㅋ";
		
		String result = str1.replace("자바", "java");
		System.out.println(result);
		System.out.println(str1);
		
		// replace를 이용한 공백 제거
		
		str1 = str1.replace(" ", "");
		System.out.println(str1);
		
		// substring - 문자열 자르기(중요)
		
		String str3 = "123123-4567890";
		
		String result3 = str3.substring(7); // 매개값을 1개 주면 앞 문자열을 절삭
		System.out.println(result3);
		
		String result4 = str3.substring(7, str3.length()); // 매개값을 2개 주면 첫번째매개값 이상~ 두번째 매개값 미만 추출
		System.out.println(result4);

		// toUpperCase, toLowerCase
		
		String str4 = "hello world";
		
		String result5 = str4.toUpperCase();
		System.out.println(result5);
		
		// trim - 문자열 앞 뒤의 공백만 제거
		
		String str5 = "     홍길 동  ";
		String result6 = str5.trim();
		System.out.println(str5);
		System.out.println(result6);
		
		
		// valueOf - 숫자를 -> 문자로 변경
		int a = 1;
		int b = 2;
		System.out.println(a + "");
		
		System.out.println(String.valueOf(a) + String.valueOf(b));
		
		// split - 문자열 자르기(특정 문자 기준) (중요)
		
		String str6 = "010-1234-5678";
		String[] arr = str6.split("-");
		System.out.println(Arrays.toString(arr));
		
		 String[] arr2 = str6.split("-", 2); // 잘린 배열의 최대크기 2
		 System.out.println(Arrays.toString(arr2)); 
		
		// contains - 특정 문자가 포함되어 있다면 true
		 
		 String str7 = "우리집 강아지 이름은? 없습니다.";
		 if(str7.contains("강아지")) {
			 System.out.println("강아지가 포함되어 있습니다.");
		 }
		 
		
		
	}
}
