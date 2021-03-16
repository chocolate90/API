package api.lang.sb;

public class MathEx {

	public static void main(String[] args) {
		
		// Math는 전부 static 메서드 클래스.이름 빠르게 접근
		double d = Math.random();
		System.out.println(d);
		
		double d1 = Math.ceil(1.1); // 올림
		System.out.println("올림:" + d1);
		
		double d2 = Math.floor(1.1); // 내림
		System.out.println(d2);
		
		double d4 = Math.round(1.1); // 반올림
		System.out.println(d4);
		
		int max = Math.max(1, 3);
		System.out.println("큰 수:" + max);
		
	}
}
