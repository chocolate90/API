package api.lang.obj;

public class PersonMain {

	public static void main(String[] args) {
		
		/*
		 *  Object 클래스의 기능
		 *  - equals - 객체의 주소값이 같다면 true
		 *  - toString - 주소값을 문자열로 반환
		 *  - finalize - 객체가 소멸될 때 호출(그 시점은 알 수가 없음)
		 */
		
		Person hong = new Person("홍길동");
		
		System.out.println(hong.equals(hong));
		
		Person kim = new Person("홍길동");
		
		System.out.println(kim.equals(hong));
		
		
		
		System.out.println(kim.toString());
		
		// finalize는 gc가 호출되는 순서를 보장하지 않기 때문에 권장되지 않는다.
		hong = null;
		System.gc(); // garbage collector를 호출
		
		// 
		try {
			Person p = (Person)kim.clone();
			System.out.println("kim으로부터 복사된 객체:" + p.getName());
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}
	 
	 
}
