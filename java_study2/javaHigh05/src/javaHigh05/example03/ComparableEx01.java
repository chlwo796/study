package javaHigh05.example03;

import java.util.TreeSet;

public class ComparableEx01 {
	public static void main(String[] args) {
//		TreeSet<Person> treeSet1 = new TreeSet<Person>();
		// 사용자 정의 객체를 비교하지 않으면 ClassCastException 발생
//		treeSet1.add(new Person("홍길동", 45));
//		treeSet1.add(new Person("김자바", 25));
//		treeSet1.add(new Person("박지원", 11));
//		treeSet1.add(new Person("박지원", 19));
//		treeSet1.add(new Person("박지원", 18));
//		treeSet1.add(new Person("박지원3", 15));
//		treeSet1.add(new Person("박지원4", 17));
//		treeSet1.add(new Person("박지원5", 11));
//
//		Iterator<Person> iterator = treeSet1.iterator();
//
//		while (iterator.hasNext()) {
//			Person person = iterator.next();
//			System.out.println(person.getName() + " " + person.getAge());
//
//		}
//		System.out.println();
//		for (Person p : treeSet1) {
//			System.out.println(p.getName() + " " + p.getAge());
//		}

		TreeSet<Person> treeSet2 = new TreeSet<Person>();
		treeSet2.add(new Person("홍길동", 45, 1.4));
		treeSet2.add(new Person("김자바", 25, 2.2));
		treeSet2.add(new Person("박지원", 11, 5.4));
		treeSet2.add(new Person("박지원", 11, 2.7));
		treeSet2.add(new Person("박지원", 18, 3.2));
		treeSet2.add(new Person("박지원3", 15, 6.2));
		treeSet2.add(new Person("박지원4", 17, 1.3));
		treeSet2.add(new Person("박지원5", 11, 2.6));
		treeSet2.add(new Person("박지원5", 11, 2.6));
		treeSet2.add(new Person("박지원5", 11, 2.6));
		System.out.println();
		for (Person p : treeSet2) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getScore());
		}

	}
}
