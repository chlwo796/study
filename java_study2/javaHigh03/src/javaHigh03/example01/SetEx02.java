package javaHigh03.example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
//		"���", "��", "�ٳ���", "��", "��", "��"
//		1. Set ������ �ֱ�
//		2. ��ü���
//		3. ũ�����
//		4. "����"�� �ִ��� �˻��ϱ�

		Set<String> fruitSet = new HashSet<String>();

		fruitSet.add("���");
		fruitSet.add("��");
		fruitSet.add("�ٳ���");
		fruitSet.add("�ٳ���");
		fruitSet.add("�ٳ���");
		fruitSet.add("�ٳ���");
		fruitSet.add("�ٳ���");
		fruitSet.add("��");
		fruitSet.add("��");
		fruitSet.add("��");
		
//		�ߺ������ʹ� �����ϰ� �����Ѵ�.(������� �Է¹��� �ʴ´�.)
		
		Iterator<String> it = fruitSet.iterator();
		while (it.hasNext()) {
			String fruits = it.next();
			System.out.println(fruits);
		}
		System.out.println(fruitSet.size());
		boolean search = true;
		it = fruitSet.iterator();
		while (it.hasNext()) {
			String fruits = it.next();
			if (fruits.equals("����")) {
				System.out.println(fruits);
			} else {
				search = false;
			}
		}
		if (!search) {
			System.out.println("�����ϴ�.");
		}
		if(fruitSet.contains("����")) {
			System.out.println("���� �ֽ��ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
	}
}