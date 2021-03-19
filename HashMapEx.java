package collection.map;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		// map - (키, 값)을 쌍으로 저장하는 구조,  키는 고유하다.
		
		// 맵 객체생성
		//HashMap<K, V> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		// map에 추가하는 기능 put(키, 값)
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "신사임당");
		
		System.out.println("맵의 크기:" + map.size());
		System.out.println(map.toString());
		
		// 맵에 같은 키를 저장했을 경우, key에 해당하는 value를 수정한다.
		map.put(4, "김유신");
		System.out.println(map.toString());
		
		// map에 저장된 value얻기 get(키);
		
		String value = map.get(1);
		System.out.println(value);
		
		// 맵에 들어있는 값을 순차적으로 확인하고 싶다면
		// keySet, entrySet을 이용해서 set 형태로 바꿔 사용해야 한다.
		
		Set<Integer> keySet = map.keySet(); // key만 뽑아서 Set으로 변경
		
		System.out.println(keySet.toString());
		
//		for(Integer i : keySet ) {
//			System.out.println(map.get(i)); // map에 들어있는 값을 순서대로
//		}
		
		Iterator<Integer> iter = keySet.iterator();
		
		while(iter.hasNext()) {
//			System.out.println(iter.next());
			System.out.println(map.get(iter.next()));
		}
		
		System.out.println("--------------------------------");
		
		Set<Entry<Integer, String>> entSet = map.entrySet();
		
		for(Entry<Integer, String> e  : entSet) {
			System.out.println(e.getKey() + ":" + e.getValue()); 
			// Entry안에는 getKey(), getValue를 이용해서 키 값을 각각 얻을 수 있다.
			
		}
		
		System.out.println("--------------------------------");
		
		// map에 있는 key여부 확인 containsKey(키)
		
		if(map.containsKey(3)) { // key가 있다면 t 없다면 f
			System.out.println("3번 키는 존재함");
		}
		
		// map의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());
		
		// map의 전체 삭제 clear()
		map.clear();
		System.out.println(map.toString());
	}
}
