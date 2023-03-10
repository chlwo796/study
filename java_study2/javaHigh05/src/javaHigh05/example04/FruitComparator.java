package javaHigh05.example04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// o2 = 기준 주소, 01 = 비교할 주소
		System.out.println(o1.getPrice());
		System.out.println(o2.getPrice());
		System.out.println(o1.getPrice().compareTo(o2.getPrice()));
		// 가격으로 비교
		return o1.getPrice().compareTo(o2.getPrice());
		// 이름으로 비교
//		System.out.println(o1.getName());
//		System.out.println(o2.getName());
//		System.out.println(o1.getName().compareTo(o2.getName()));
//		return o1.getName().compareTo(o2.getName());
	}
}
