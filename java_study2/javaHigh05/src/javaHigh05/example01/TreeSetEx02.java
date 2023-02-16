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

		// ���� ���� �⺻����?
		System.out.println("���� ���� �⺻�� : " + treeSet1.last());
		// ���� ���� �⺻����?
		System.out.println("���� ���� �⺻�� : " + treeSet1.first());
		// �⺻�� ��������
		System.out.println("�������� ����");
		for (Integer i : treeSet1) {
			System.out.println(i);
		}
		// �⺻�� ��������
		System.out.println("�������� ����");
		NavigableSet<Integer> navigableSet1 = treeSet1.descendingSet();
		for (Integer i : navigableSet1) {
			System.out.println(i);
		}

		TreeSet<String> treeSet2 = new TreeSet<String>();

		treeSet2.add("����");
		treeSet2.add("���");
		treeSet2.add("���");
		treeSet2.add("�븮");
		treeSet2.add("�븮");
		treeSet2.add("���");
		treeSet2.add("����");
		treeSet2.add("����");

		// �������� ����
		for (String s : treeSet2) {
			System.out.println(s);
		}
		NavigableSet<String> navigableSet2 = treeSet2.descendingSet();
		// �������� ����
		System.out.println();
		for (String s : navigableSet2) {
			System.out.println(s);
		}
		// ������ ����
		System.out.println(treeSet2.size());

		// ���� �ٷ� �Ʒ���?

		System.out.println(treeSet2.lower("����"));
		// �븮 �ٷ� ����?
		
		System.out.println(treeSet2.higher("�븮"));
	}
}