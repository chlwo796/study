package javaHigh03.example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
//		"사과", "배", "바나나", "귤", "배", "배"
//		1. Set 데이터 넣기
//		2. 전체출력
//		3. 크기출력
//		4. "참외"가 있는지 검색하기

		Set<String> fruitSet = new HashSet<String>();

		fruitSet.add("사과");
		fruitSet.add("배");
		fruitSet.add("바나나");
		fruitSet.add("바나나");
		fruitSet.add("바나나");
		fruitSet.add("바나나");
		fruitSet.add("바나나");
		fruitSet.add("귤");
		fruitSet.add("배");
		fruitSet.add("배");
		
//		중복데이터는 제외하고 저장한다.(순서대로 입력받지 않는다.)
		
		Iterator<String> it = fruitSet.iterator();
		while (it.hasNext()) {
			String fruits = it.next();
			System.out.println(fruits);
		}
		System.out.println(fruitSet.size());
		boolean search = true;
		it = fruitSet.iterator();
		while (it.hasNext()) {
			String fruits = it.next();
			if (fruits.equals("참외")) {
				System.out.println(fruits);
			} else {
				search = false;
			}
		}
		if (!search) {
			System.out.println("없습니다.");
		}
		if(fruitSet.contains("참외")) {
			System.out.println("참외 있습니다.");
		}else {
			System.out.println("없습니다.");
		}
	}
}
