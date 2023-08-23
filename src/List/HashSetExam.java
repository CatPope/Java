package List;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {

		// 중복 저장이 안된다.
		HashSet<String> set = new HashSet<>();

		set.add("유재석");
		set.add("김종국");
		set.add("송지효");
		set.add("지석진");
		set.add("하하");
		set.add("전소민");
		set.add("유재석");
		System.out.println("학생 수:" + set.size());
		System.out.println(set);
		System.out.println("---------------------------------------");
		if(set.contains("유재석"))
			System.out.println("유재석 존재");
		System.out.println("---------------------------------------");
		System.out.println("삭제전:" + set.size());
		set.remove("유재석");
		System.out.println("삭제후:" + set.size());
		System.out.println("---------------------------------------");
		set.clear();
		if(set.isEmpty())
			System.out.println("전체 삭제 후 학생수:" + set.size());
		System.out.println("---------------------------------------");
		
		
		
		
		

	}

}
