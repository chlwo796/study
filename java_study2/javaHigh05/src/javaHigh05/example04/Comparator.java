package javaHigh05.example04;

import java.util.TreeSet;

public class Comparator {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet1 = new TreeSet<Fruit>(new FruitComparator());
		
		treeSet1.add(new Fruit("포도", 11100));
		treeSet1.add(new Fruit("수박", 10000));
		treeSet1.add(new Fruit("딸기", 6000));
		treeSet1.add(new Fruit("사과", 6000));
		treeSet1.add(new Fruit("바나나", 1500));
		
		System.out.println(treeSet1.size());
		
		System.out.println("-----");
		TreeSet<Movie> treeSet2 = new TreeSet<Movie>(new MovieComparator());
		
		treeSet2.add(new Movie("조커", 12405));
		treeSet2.add(new Movie("알라딘", 25100));
		treeSet2.add(new Movie("남산의부장들", 11478));
		treeSet2.add(new Movie("극한직업", 30100));
		treeSet2.add(new Movie("기생충", 33542));
		
		for(Movie m : treeSet2) {
			System.out.println(m.getMovieName() + " " + m.getTicket());
		}
		
	}

}
