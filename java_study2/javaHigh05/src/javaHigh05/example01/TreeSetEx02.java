package javaHigh05.example01;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx02 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();

		treeSet1.add(3500000);
		treeSet1.add(2150000);
		treeSet1.add(2200000);
		treeSet1.add(2700000);
		treeSet1.add(2750000);

		// 가장 높은 기본급은?
		System.out.println("가장 높은 기본급 : " + treeSet1.last());
		// 가장 낮은 기본급은?
		System.out.println("가장 낮은 기본급 : " + treeSet1.first());
		// 기본급 오름차순
		System.out.println("오름차순 정렬");
		for (Integer i : treeSet1) {
			System.out.println(i);
		}
		// 기본급 내림차순
		System.out.println("내림차순 정렬");
		NavigableSet<Integer> navigableSet1 = treeSet1.descendingSet();
		for (Integer i : navigableSet1) {
			System.out.println(i);
		}

		TreeSet<String> treeSet2 = new TreeSet<String>();

		treeSet2.add("과장");
		treeSet2.add("사원");
		treeSet2.add("사원");
		treeSet2.add("대리");
		treeSet2.add("대리");
		treeSet2.add("사원");
		treeSet2.add("과장");
		treeSet2.add("부장");

		// 오름차순 정렬
		for (String s : treeSet2) {
			System.out.println(s);
		}
		NavigableSet<String> navigableSet2 = treeSet2.descendingSet();
		// 내림차순 정렬
		System.out.println();
		for (String s : navigableSet2) {
			System.out.println(s);
		}
		// 직급의 개수
		System.out.println(treeSet2.size());

		// 부장 바로 아래는?

		System.out.println(treeSet2.lower("부장"));
		// 대리 바로 위는?
		
		System.out.println(treeSet2.higher("대리"));
	}
}