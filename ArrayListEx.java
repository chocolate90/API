package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// List - 순서(index), 중복을 허용한다.
		
		// ArrayList 생성
		
		//ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		// list에 추가 add();
		
		list.add("JAVA");
		list.add("JSP");
		list.add("DB");
		list.add("SPRING");
		list.add("JAVA");
		
		// list의 크기 size()
		
		System.out.println("리스트의 크기:" + list.size());
		
		// list에 저장된 값을 문자열로 확인 toString()
		System.out.println(list.toString());
		
		// list 중간에 추가 add(인덱스, 값)
		
		list.add(3, "ORACLE");
		
		System.out.println(list.toString());
		
		// list 값의 수정 set(인덱스, 값)
		
		list.set(3, "MYSQL");
		
		System.out.println(list.toString());
		
		// list의 값 얻기 get(인덱스)
		
		String str = list.get(3);
		System.out.println( "3번쨰 인덱스의 값은: " + str);
		
		// list의 값의 포함 여부 contains()
		
		if(list.contains("JAVA")) { // 하나라도 포함되어 있다면 true, 아니면 false
			System.out.println("포함");
		}
		
		// list의 삭제 remove(값), remove(인덱스) 
		
		list.remove("JSP");
		System.out.println(list.toString());
		
		// list의 전체삭제 clear() 
		
		list.clear();
		System.out.println(list.toString());
	
		// addAll - collection을 통째로 마지막에 추가해 준다.
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("홍길동");
		list2.add("이순신");
		
		list.addAll(list2);
		System.out.println(list.toString());
		
		// 배열을 리스트로 바꾸는 방법
		
		String[] arr = {"박찬호", "이순신"};
		
		List<String> list3 = Arrays.asList(arr);
		System.out.println(list3.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
