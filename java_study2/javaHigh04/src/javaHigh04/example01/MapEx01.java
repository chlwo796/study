package javaHigh04.example01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("컴퓨터", 200);
		map1.put("프린터", 50);
		map1.put("아이폰", 210);
		map1.put("갤럭시탭", 170);
		// key -> value
		System.out.println(map1.get("컴퓨터"));
		System.out.println(map1.get("아이폰"));
		// 매장에 냉장고가 있나요?
		if (map1.containsKey("냉장고")) {
			System.out.println("있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		System.out.println(map1);
		// 150만원 넘는 목록

		Set<String> set = map1.keySet(); // key -> set 컬렉션

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (map1.get(key) > 150) {
				System.out.println(key + " " + map1.get(key));
			}
		}
		// 170만원짜리 품목이 있습니까?
		it = set.iterator();
		boolean check = true;
		while (it.hasNext()) {
			String key = it.next();
			if (map1.get(key)==170) {
				System.out.println(key + "있습니다.");
				check = false;
			}
		}
		if(check) {
			System.out.println("없습니다.");
		}

	}
}