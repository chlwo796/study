package javaHigh11.exercise07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("ȫ�浿", "������"), new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������"));
		List<Member> developers = list.stream().filter(s -> s.getJob().equals("������")).collect(Collectors.toList());
		developers.stream().forEach(d -> System.out.println(d.getName()));
	}
}