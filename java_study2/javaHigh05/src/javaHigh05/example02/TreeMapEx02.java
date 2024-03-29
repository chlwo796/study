package javaHigh05.example02;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx02 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap1 = new TreeMap<String, String>();

		treeMap1.put("������1", "����ȣ");
		treeMap1.put("ȫ����1", "�谭��");
		treeMap1.put("��ȹ��1", "�迵��");
		treeMap1.put("�ѹ���1", "�迵��");
		treeMap1.put("�λ��1", "ȫ�浿");
		treeMap1.put("ȸ���1", "����ȯ");
		treeMap1.put("���ߺ�1", "����ȯ");
		treeMap1.put("������2", "����ȣ");
		treeMap1.put("ȫ����2", "�谭��");
		treeMap1.put("��ȹ��2", "�迵��");
		treeMap1.put("�ѹ���2", "�迵��");
		treeMap1.put("�λ��2", "ȫ�浿");
		treeMap1.put("ȸ���2", "����ȯ");
		treeMap1.put("���ߺ�2", "����ȯ");

		for (Entry<String, String> e : treeMap1.entrySet()) {
			System.out.println(e);
		}
		System.out.println();
		for (String e : treeMap1.descendingKeySet()) {
			System.out.println(e + "=" + treeMap1.get(e));
		}
		System.out.println();
		System.out.println(treeMap1.firstEntry());
		System.out.println(treeMap1.lastEntry());
		System.out.println(treeMap1.lowerEntry("ȸ��"));
		System.out.println(treeMap1.higherEntry("ȸ��"));
	}
}
