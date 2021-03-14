package api.lang.sys;

public class SystemEx {

	public static void main(String[] args) {
		
		/*
		 *  System은 운영체제 관련된 내용을 확인할 수 있는 클래스
		 *  전부 static멤버로 구성되어 있다.
		 *  
		 *  프로그램의 간단한 시간측정에 사용할 수 있습니다.
		 *  
		 *  1970년 1월 1일 00시 기준으로 현재까지 흘러온 시간을 밀리초로 반환
		 */
		
		long start = System.currentTimeMillis();
		
		
		int sum = 0;
		for(long i = 1; i < 10000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();

		System.out.println("경과시간:" + (end - start) * 0.001);
	}
}
