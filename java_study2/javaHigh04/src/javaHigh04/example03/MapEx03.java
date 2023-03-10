package javaHigh04.example03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
//		담임선생님 이름 = key, 반, 명수 = value
		Map<String, School> schoolMap = new HashMap<String, School>();

		School school1 = new School("정현희", new School("3학년1반", 20));
		School school2 = new School("최재환", new School("2학년2반", 23));
		School school3 = new School("아무개", new School("1학년3반", 21));
		School school4 = new School("홍길동", new School("2학년4반", 19));
		School school5 = new School("무명", new School("2학년3반", 24));

		schoolMap.put(school1.getTeacher(), school1.getSchool());
		schoolMap.put(school2.getTeacher(), school2.getSchool());
		schoolMap.put(school3.getTeacher(), school3.getSchool());
		schoolMap.put(school4.getTeacher(), school4.getSchool());
		schoolMap.put(school5.getTeacher(), school5.getSchool());

		// mapping 시 주소를 대입했기 때문에 key를 출력하려면 직접적으로 호출하여야 한다.

		System.out.println("-------------------");
		System.out.println(school1.getTeacher());
		System.out.println(schoolMap.get(school1.getTeacher()).getGrade());
		System.out.println(schoolMap.get(school1.getTeacher()).getStNumber());

		System.out.println("-------------------");
		System.out.println(school2.getTeacher());
		System.out.println(schoolMap.get(school2.getTeacher()).getGrade());
		System.out.println(schoolMap.get(school2.getTeacher()).getStNumber());

		System.out.println("-------------------");
		System.out.println(school3.getTeacher());
		System.out.println(schoolMap.get(school3.getTeacher()).getGrade());
		System.out.println(schoolMap.get(school3.getTeacher()).getStNumber());

		System.out.println("-------------------");
		System.out.println(school4.getTeacher());
		System.out.println(schoolMap.get(school4.getTeacher()).getGrade());
		System.out.println(schoolMap.get(school4.getTeacher()).getStNumber());

		System.out.println("-------------------");
		System.out.println(school5.getTeacher());
		System.out.println(schoolMap.get(school5.getTeacher()).getGrade());
		System.out.println(schoolMap.get(school5.getTeacher()).getStNumber());

		// keySet();으로 key를 Set으로 만들어주고 반복자 호출
		System.out.println("------");
		Set<String> keys = schoolMap.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 선생님의 인원수는?
		System.out.println("------");
		System.out.println(keys.size());
		System.out.println("------");
		
		it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			School school = schoolMap.get(key);
			System.out.println(key);
		    // get(key) -> value
			System.out.println(school.getGrade());
			System.out.println(school.getStNumber());
		}
	}
}
