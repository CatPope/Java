package List;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {

		//LinkedList는 데이터 추가/삭제가 용이 (검색은 복잡도가 높다)
		LinkedList<String> list = new LinkedList<>();
		
		//데이터 추가
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("--------------------------------");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("--------------------------------");
		System.out.println(list);
		list.addFirst("서장훈");
		list.addLast("김희철");
		list.add(1, "김영철");
		System.out.println(list);
		System.out.println("--------------------------------");
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		
		
		
		
		

	}

}
