package javaHigh05.example05;

import java.util.TreeSet;

public class ComparatorEx01 {
	public static void main(String[] args) {
		TreeSet<Bus> treeSet1 = new TreeSet<Bus>(new BusComparator());
		
		treeSet1.add(new Bus("경복궁", 6));
		treeSet1.add(new Bus("광화문", 3));
		treeSet1.add(new Bus("청계천", 4));
		treeSet1.add(new Bus("인사동", 5));
		System.out.printf("%s\t%s\n", "목적지","정류장수");
		for(Bus b : treeSet1) {
			System.out.printf("%s\t%d\n",b.getDestination(), b.getStop());
		}
		
	}
}
