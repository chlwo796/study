package javaHigh05.example05;

import java.util.TreeSet;

public class ComparatorEx01 {
	public static void main(String[] args) {
		TreeSet<Bus> treeSet1 = new TreeSet<Bus>(new BusComparator());
		
		treeSet1.add(new Bus("�溹��", 6));
		treeSet1.add(new Bus("��ȭ��", 3));
		treeSet1.add(new Bus("û��õ", 4));
		treeSet1.add(new Bus("�λ絿", 5));
		System.out.printf("%s\t%s\n", "������","�������");
		for(Bus b : treeSet1) {
			System.out.printf("%s\t%d\n",b.getDestination(), b.getStop());
		}
		
	}
}