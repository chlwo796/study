package javaChap13.example01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "�ȳ��ϼ���";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}
}
