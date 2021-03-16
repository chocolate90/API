package quiz16;


public class StrQuiz04 {
	
//	public static void main(String[] args) {
//		
//		/*
//		 * Palindrome함수는 매개변수로 String을 받아서 회문 여부를 검사하는 메서드
//		 * 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문자
//		 * 
//		 * ex) 다시 합창 합시다, 다시다, 다 같은 것은 같다.
//		 * 
//		 * 문장은 공백을 포함해서 매개값을 받아도 된다.
//		 * 회문이라면 "회문" 아니라면 "회문이 아닙니다"를 리턴
//		 * 
//		 */
//		
//		String pal =  Palindrome("다시 합창 합시다");
//		
//		System.out.println(pal);
//	}
	
	public static String Palindrome(String s) {
		s = s.replace(" ", "");
		
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			
			if(s.charAt(i) == s.charAt(j)) {
				return "화문입니다.";
			} else {
				return "화문이 아닙니다.";
			}
			
		}
		return "";
		
	}
	
	public static String pal1(String s) {
		
		s = s.replace(" ", "");
		
		for(int i = 0; i < s.length() /2; i++) {
			
			if(s.charAt(i) != s.charAt( s.length()-1-i )) {
				return "화문이 아닙니다";
			}
		}
		
		return "화문입니다";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
