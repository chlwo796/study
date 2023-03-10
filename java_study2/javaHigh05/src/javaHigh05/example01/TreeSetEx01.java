package javaHigh05.example01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx01 {
	public static void main(String[] args) {
		TreeSet<Integer> tree1 = new TreeSet<Integer>();

		tree1.add(4);
		tree1.add(7);
		tree1.add(4);
		tree1.add(0);
		tree1.add(8);
		tree1.add(9);
		tree1.add(2);

		System.out.println("트리의 노드 수 ->" + tree1.size());
		System.out.println("제일 낮은 객체 ->" + tree1.first());
		System.out.println("제일 높은 객체 ->" + tree1.last());
		System.out.println("7의 바로 아래 객체 ->" + tree1.lower(7));
		System.out.println("7의 바로 위 객체 ->" + tree1.higher(7));
		System.out.println("5와 같은 객체 ->(없으면 바로 아래 객체)" + tree1.floor(5));
		System.out.println("3와 같은 객체 ->(없으면 바로 위 객체)" + tree1.ceiling(3));
		System.out.println("제일 낮은 객체 꺼내온 후 제거 " + tree1.pollFirst());
		System.out.println("제일 높은 객체 꺼내온 후 제거 " + tree1.pollLast());
		System.out.println("제일 낮은 객체 ->" + tree1.first());
		System.out.println("제일 높은 객체 ->" + tree1.last());
		System.out.println("트리의 노드 수 ->" + tree1.size());

		// 오름차순
		Iterator<Integer> iterator = tree1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		// descendingIterator() = 반대순서, 내림차순
		Iterator<Integer> iterator1 = tree1.descendingIterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out.println();
		// NavigableSet = 정렬된 Set
		NavigableSet<Integer> navigableSet = tree1.descendingSet();
		Iterator<Integer> iterator2 = navigableSet.iterator();

		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		System.out.println();
		System.out.println(navigableSet.first());
		System.out.println(navigableSet.floor(3));
		System.out.println();
		SortedSet<Integer> sortedSet1 = tree1.headSet(8);
		for (Integer i : sortedSet1) {
			System.out.println(i);
		}
		System.out.println();
		SortedSet<Integer> sortedSet2 = tree1.headSet(8, true);
		for (Integer i : sortedSet2) {
			System.out.println(i);
		}
		System.out.println();
		SortedSet<Integer> sortedSet3 = tree1.tailSet(4);
		for (Integer i : sortedSet3) {
			System.out.println(i);
		}
		System.out.println();
		SortedSet<Integer> sortedSet4 = tree1.subSet(2, true, 8, false);
		for (Integer i : sortedSet4) {
			System.out.println(i);
		}
		
	}
}
