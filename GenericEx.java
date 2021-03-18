package collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		
		/*
		 * list를 매개변수나, 반환 타입으로 사용할 때 쓸 수 있는 문법
		 * List<?> - 무엇이든 다 들어 갈 수 있음
		 * List<? extends String> - String을 포함한 자식클래스는 전달 가능
		 * List<? super Integer> - Integer의 형태를 가질 수 있다면 전달 가능
		 */
		
		List<String> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Object> list2 = new ArrayList<>();
		
		test01(list);
		test01(list1);
		test01(list2);
		
		test02(list);
		//test02(list1); 불가 String이나 String의 자식 클래스만 가능
		//test02(list2); 불가 String이나 String의 자식 클래스만 가능
		
		//test03(list); 불가 String은 Integer의 형태를 가질 수 없다.
		test03(list1);
		test03(list2);
	}
	
	// list를 전달 받는 메서드
	
	public static void test01(List<?> list) { // 무엇이든 들어간다.
		
	}
	
	public static void test02(List<? extends String> list) {
		
	}
	
	public static void test03(List<? super Integer> list) {
		
	}
	
	public static void add(List<String> list) {
		
	}
	
	// list를 반환 받는 메서드
	
	public static List<String> add2() {
		
		return null;
	}
}
