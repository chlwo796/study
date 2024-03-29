package javaHigh03.example04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx03 {
	public static void main(String[] args) {
		Set<Shop> shopSet = new HashSet<Shop>();
		shopSet.add(new Shop("�̱��", "1234", 100));
		shopSet.add(new Shop("���ູ", "2345", 90));
		shopSet.add(new Shop("�ڼ���", "1566", 300));
		shopSet.add(new Shop("�����", "1234", 100));
		shopSet.add(new Shop("�ֱ��", "1234", 80));
		shopSet.add(new Shop("�ֱ��", "1234", 100));

		Iterator<Shop> it = shopSet.iterator();

		while (it.hasNext()) {
			Shop shop = it.next();
			System.out.println(shop.getCustname() + " " + shop.getCustPhone() + " " + shop.getPoint());
		}
		it = shopSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		String searchName = "���ູ";
		String searchPhone = "2345";
		int searchNumber = 0;
		for (int i = 0; i < shopSet.size(); i++) {
			if (shopSet.contains(searchName) && shopSet.contains(searchPhone)) {
				searchNumber = i;
			}
		}
		it = shopSet.iterator();
		boolean searchOK = false;
		while (it.hasNext()) {
			Shop shop = it.next();
			if (shop.getCustname().equals(searchName) && shop.getCustPhone().equals(searchPhone)) {
				System.out.println(shop.getPoint());
				searchOK = true;
			}
		}
		if (!searchOK) {
			System.out.println(searchName + "�� " + searchPhone + " ������ �����ϴ�.");
		}
	}
}
