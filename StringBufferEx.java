package api.lang.sb;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str = new String("java ");
		
		StringBuffer sb = new StringBuffer("java ");
		
		
		// 차이점
		
		str = str + "program"; //문자열 변경 (새롭게 문자열 생성)
		sb.append("program"); // 문자열 변경(1개의 객체를 재활용)
		
		System.out.println(str);
		System.out.println(sb);
		
		// 문자열 추가
		sb.append(" study");
		System.out.println(sb);
		
		// 문자열 중간에 추가
		
		sb.insert(12, "ming");
		System.out.println(sb);
		
		// 문자열 삭제
		
		sb.delete(5, 17);
		System.out.println(sb);
		
		// 문자열 변경
		
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		// 문자열 거꾸로 reverse
		
		sb.reverse();
		System.out.println(sb);
		
		// String형태로 변경
		String s = sb.toString();
		System.out.println(s);
	}
}
