package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");

		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list);
		
		
		System.out.println("삭제 전 신청 학생 수: "+ list.size());
		
		
		list.remove("김종국");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));		
		
		
		for(String s: list) {
			System.out.println(s);
		}
		
		
		System.out.println("데이터 변경 전: " + list.get(0));
		list.set(0, "이수근");
		System.out.println("데이터 변경 후: " + list.get(0));
		
		
		System.out.println(list.indexOf("송지효"));
		if(list.contains("송지효")) {
			System.out.println("송지효 포함o");
		}
		else {
			System.out.println("송지효 포함x");
		}
		
		
		list.clear();
		if(list.isEmpty()) {
			System.out.println("학생수: " + list.size());
		}
		
		list.add("울라울라");
		list.add("원신최고");
		list.add("블아해야지");
		
		Collections.sort(list);
		
		for(String s: list) {
			System.out.println(s);
		}

	}

}
