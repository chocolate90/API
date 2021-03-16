package quiz16;


import java.util.Scanner;

public class StrQuiz01 {

	public static void main(String[] args) {
		
		/*
		 *  스캐너를 통해서 id를 입력받는다.
		 *  id는 공백을 포함해서 받을 수 있다.
		 *  단, 공백을 제거한 id가 4글자 미만이면 다시 입력 받으세요.
		 *  4글자 이상이라면 "id가 등록 되었습니다." 출력 후 종료
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("id>");
			String id = scan.nextLine();
			
			id = id.replace(" ", "");
			System.out.println(id.length());
			if(id.length() < 4) {
				System.out.println("id가 4글자 미만입니다. 다시 입력하세요");
			} else {
				System.out.println("id가 등록되었습니다.");
				break;
			}
		}
		scan.close();
	}
}
