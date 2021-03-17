package generic.basic;

public class BasicMain {

	public static void main(String[] args) {
		
		Basic<Integer, String> bs = new Basic<>();
		
		bs.set(1, "홍길동");
		
		String name = bs.get(1);
		System.out.println(name);
		
		System.out.println(bs.toString());
		
	}
}
