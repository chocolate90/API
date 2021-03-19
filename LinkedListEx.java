package collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx {

	public static void main(String[] args) {

		//List<String> list = new LinkedList<>(); 
		//Queue<String> list = new LinkedList<>();

		LinkedList<String> list = new LinkedList<>();

		// 추가

		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");

		System.out.println(list.toString());

		// 값 얻기

		String name = list.get(0);
		System.out.println("0번째 인덱스의 값:" + name);

		// 처음에 추가
		list.addFirst("박찬호");
		System.out.println(list.toString());

		// 마지막에 추가

		list.addLast("신사임당");
		System.out.println(list.toString());

		// 전체 삭제
		list.clear();

		// 링크리스트는 stack 처럼 동작 - LIFO(last in first out)

		// push, pop, peek

		list.push("강감찬");
		list.push("이순신");
		list.push("박찬호");
		System.out.println(list.toString());

		list.pop(); // 꺼내면서 삭제
		System.out.println(list.toString());

		System.out.println(list.peek()); // 값만 읽기

		System.out.println("-----------------------");

		// linkedList는 queue처럼 동작 - FIFO (first in first out)
		// offer, poll, peek

		list.clear();

		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());

		list.poll();
		System.out.println(list.toString());

		System.out.println(list.peek());


	}
}
