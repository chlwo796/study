package javaHigh03.example02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {
	public static void main(String[] args) {
		Set<Member> memberSet = new HashSet<Member>();
		memberSet.add(new Member("ȫ�浿", 30));
		memberSet.add(new Member("�̼���", 25));
		memberSet.add(new Member("�ֱ��", 10));
		memberSet.add(new Member("ȫ�浿", 30));
		
		Iterator<Member> it = memberSet.iterator();
		while(it.hasNext()) {
		System.out.println(it.next()); // �ּ� ���
		}
		it = memberSet.iterator();
		while(it.hasNext()) {
			Member member = it.next();	// memberSet�� �ּҿ� member ��ü�� ����
		System.out.println(member.getName() + " " + member.getAge());
		}
	}
}