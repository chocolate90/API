package generic.good;

public class genericMain01 {

	public static void main(String[] args) {
		
		/*
		 *  제네릭을 사용하면, 객체를 생성할 때 사용할 타입을 저장할 수 있고,
		 *  다양한 값을 저장하도록 생성해서 사용이 가능하다.
		 */
		
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동"); // 저장
		String str = abc.getT(); // 사용
		
		ABC<DEF> abc2 = new ABC<>(); //생성자의 타입 생략 가능
		
		abc2.setT(new DEF());
		DEF def = abc2.getT();
		
//		ABC<int> a = new ABC<>(); // 제네릭은 기본형이 저장될 수 없다.
		
	}
}
