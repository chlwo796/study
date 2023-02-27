package javaHigh05.example06;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorEx03 {
	public static void main(String[] args) {
		TreeMap<TeamName, Values> treeMap1 = new TreeMap<TeamName, Values>(new TeamNameComparator());

		treeMap1.put(new TeamName("���Ͽ���"), new Values("���ﺻ��", "��ȭ��", 4460));
		treeMap1.put(new TeamName("��������"), new Values("���ﺻ��", "���θ�", 6500));
		treeMap1.put(new TeamName("��������"), new Values("���ﺻ��", "��ȭ��", 6800));
		treeMap1.put(new TeamName("��������"), new Values("���ﺻ��", "���θ�", 5580));
		treeMap1.put(new TeamName("�д翵��"), new Values("��⺻��", "���θ�", 3560));
		System.out.println();
		System.out.println("�⺻ keySet()���� ����");
		Set<TeamName> keySet = treeMap1.keySet();
		System.out.printf("%s\t%s\t%s\t%s\n", "�Ҽ�", "�μ���", "������ġ", "�������");
		for (TeamName t : keySet) {
			System.out.printf("%s\t%s\t%s\t%d\n", treeMap1.get(t).getRegion(), t.getTeamName(), treeMap1.get(t).getStore(), treeMap1.get(t).getSale());
		}
		System.out.println();
		System.out.println("iterator()�� ����");
		Iterator<TeamName> iterator = keySet.iterator();
		System.out.printf("%s\t%s\t%s\t%s\n", "�Ҽ�", "�μ���", "������ġ", "�������");
		while(iterator.hasNext()) {
			TeamName keys = iterator.next();
			System.out.printf("%s\t%s\t%s\t%d\n", treeMap1.get(keys).getRegion(), keys.getTeamName(), treeMap1.get(keys).getStore(), treeMap1.get(keys).getSale());
		}
		System.out.println();
		System.out.println("descendingKeySet()���� ����");
		NavigableSet<TeamName> navigableKeySet= treeMap1.descendingKeySet();
		System.out.printf("%s\t%s\t%s\t%s\n", "�Ҽ�", "�μ���", "������ġ", "�������");
		for (TeamName t : navigableKeySet) {
			System.out.printf("%s\t%s\t%s\t%d\n", treeMap1.get(t).getRegion(), t.getTeamName(), treeMap1.get(t).getStore(), treeMap1.get(t).getSale());
		}
		System.out.println();
		System.out.print("Key(�μ���) �˻�>");
		Scanner sc = new Scanner(System.in);
		String searchKey = sc.nextLine();
		System.out.printf("%s\t%s\t%s\n", "�μ���", "������ġ", "�������");
		for (TeamName t : keySet) {
			if(t.getTeamName().contains(searchKey)) {
				System.out.printf("%s\t%s\t%d\n", t.getTeamName(), treeMap1.get(t).getStore(), treeMap1.get(t).getSale());
			}
		}
		System.out.println();
		System.out.print("����� �� �� : ");
		int sum = 0;
		for (TeamName t : navigableKeySet) {
			sum += treeMap1.get(t).getSale();
		}
		System.out.println(sum);
		
	}
}