package javaHigh05.example05;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ComparatorEx02 {
	public static void main(String[] args) {
		TreeMap<String, BusinessSale> treeMap1 = new TreeMap<String, BusinessSale>();

		treeMap1.put("���Ͽ���", new BusinessSale("��ȭ��", 4460));
		treeMap1.put("��������", new BusinessSale("���θ�", 6800));
		treeMap1.put("��������", new BusinessSale("��ȭ��", 5580));
		treeMap1.put("��������", new BusinessSale("���θ�", 3560));
		System.out.printf("%s\t%s\t%s\n", "�μ���", "������ġ", "�ǸŽ���");
		Set<String> keySet = treeMap1.keySet();
		for (String s : keySet) {
			System.out.printf("%s\t%s\t%d\n", s, treeMap1.get(s).getStore(), treeMap1.get(s).getSale());
		}
		NavigableMap<String, BusinessSale> navigableMap1 = treeMap1.descendingMap();
		Set<Entry<String, BusinessSale>> entry1 = navigableMap1.entrySet();
		System.out.printf("%s\t%s\t%s\n", "�μ���", "������ġ", "�ǸŽ���");
		for (Entry<String, BusinessSale> entry : entry1) {
			System.out.printf("%s\t%s\t%d\n", entry.getKey(), entry.getValue().getStore(), entry.getValue().getSale());
		}
		
		Scanner sc = new Scanner(System.in);
		String search = sc.nextLine();
		System.out.println(treeMap1.get(search).getStore());
		System.out.println(treeMap1.get(search).getSale());
		int sumSale= 0;
		for (String s : keySet) {
			sumSale += treeMap1.get(s).getSale();
		}
		System.out.println(sumSale);
	}
}