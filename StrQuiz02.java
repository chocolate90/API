package quiz16;

import java.util.Scanner;

public class StrQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 주민번호는 13자리를 입력 받는다.
		 * 주민번호는 - 포함해서 받을 수도 있다.
		 * 13자리가 아니라면 다시 입력 받는다.
		 * 남자 or 여자 구분해서 출력한다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민번호>");
			String ssn = scan.next();
			
			String result = ssn.substring(0, 6);
			String result1 = ssn.substring(7, ssn.length());
			String result2 = result + result1;

			if(result2.length() == 13) {
				if(result2.charAt(6) == '1') {
					System.out.println("남자 입니다.");
					break;
				} else if(result2.charAt(6) == '2') {
					System.out.println("여자 입니다.");
					break;
				}
			} else {
				System.out.println("주민번호는 13자리 입니다.");
			}
		}
		
//		a:while(true) {
//			System.out.println("주민번호>");
//			String ssn1 = scan.nextLine();
//			
//			ssn1 = ssn1.replace("-" , "");
//			
//			if(ssn1.length() != 13) {
//				System.out.println("주민번호는 13자리 입니다.");
//			} else {
//				
//				switch (ssn1.charAt(6)) {
//				case '1':
//				case '3':
//					System.out.println("남자");
//					break a;
//
//				case '2':
//				case '4':
//					System.out.println("여자");
//					break a;
//				default:
//					System.out.println("잘못 입력 했습니다.");
//					continue a;
//						
//				}
//				
//			}
//		}
		scan.close();
	}
}
