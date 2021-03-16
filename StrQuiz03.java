package quiz16;

public class StrQuiz03 {

	public static void main(String[] args) {
		
		// 실제 코딩테스트 문제
		
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return하는 메서드
		 * 
		 * 조건
		 * n은 1억 이하의 자연수
		 * n을 자료형 변환해서 연산하지 말것. 
		 * String을 이용해서 test01메서드
		 * String을 이용하지 않고 test02메서드
		 */
	
		int result = test01("55555555");
		System.out.println(result);
		
		int result1 = test02(55487548);
		System.out.println(result1);
		
		int result2 = test03(1111);
		System.out.println(result2);
	}
	
	public static int test01(String n) {
		
		int sum1 = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			sum1 +=  n.charAt(i) - '0';
		}
		
		
		return sum1;
	}
	
	public static int test02(int n) {
		
		int sum = 0;
		
		if(n <= 100000000) {
			while(n > 0) {
				sum += n%10;
				n /= 10;
			}
		}
		
		return sum;
	}
	
	public static int test03(int n) {
		
		int sum = 0;
		for(int i = 100000000; i >= 1; i /= 10) {
		
			sum += (n / i); // 몫
			n -= (n / i) * i;
		}
		
		return sum;
	}
	
	public static int test04(int n) {
		
		int sum = 0;
		String s = String.valueOf(n);
		
		for(int i = 0; i < s.length(); i++) {
			sum = Integer.parseInt(s.charAt(i)+"");
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
