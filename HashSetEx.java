package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		// set 계열은 순서(index) X, 중복 X
		
//		HashSet<String> set = new HashSet<>();
		
		Set<String> set = new HashSet<>();
		
		// set에 추가 add()
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");
		
		// set에 저장된 크기 size();
		System.out.println("크기:" + set.size());
		
		System.out.println(set.toString());
		
		// set에 들어있는 객체를 찾으려면, 반복자를 통해서 하나씩 순서대로 확인한다.
		
		Iterator<String> iter = set.iterator();
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
		
		while(iter.hasNext()) { // 다음이 있다면 t 없다면 f
			System.out.println(iter.next());
		}
		
		// set의 검색(포함여부) - contains();
		
		if(set.contains("JAVA")) System.out.println("자바가 포함되어 있음");
		
		// set의 삭제 remove(값)
		
		set.remove("ORACLE");
		System.out.println(set.toString());
	}
}
