package javaHigh05.example04;

import java.util.TreeSet;

public class Comparator {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet1 = new TreeSet<Fruit>(new FruitComparator());
		
		treeSet1.add(new Fruit("����", 11100));
		treeSet1.add(new Fruit("����", 10000));
		treeSet1.add(new Fruit("����", 6000));
		treeSet1.add(new Fruit("���", 6000));
		treeSet1.add(new Fruit("�ٳ���", 1500));
		
		System.out.println(treeSet1.size());
		
		System.out.println("-----");
		TreeSet<Movie> treeSet2 = new TreeSet<Movie>(new MovieComparator());
		
		treeSet2.add(new Movie("��Ŀ", 12405));
		treeSet2.add(new Movie("�˶��", 25100));
		treeSet2.add(new Movie("�����Ǻ����", 11478));
		treeSet2.add(new Movie("��������", 30100));
		treeSet2.add(new Movie("�����", 33542));
		
		for(Movie m : treeSet2) {
			System.out.println(m.getMovieName() + " " + m.getTicket());
		}
		
	}

}