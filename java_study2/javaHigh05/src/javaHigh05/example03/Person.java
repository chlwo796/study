package javaHigh05.example03;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	private Double score;
	
	public Person(String name, int age, Double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public int compareTo(Person o) {
		// �̸����� ����, String Ŭ������ �ִ� �޼ҵ� compareTo()�� ȣ���Ͽ� �����۾�����
//		return name.compareTo(o.name);
		// �̸� �Ųٷ� ����
//		return o.name.compareTo(name);
		// ���̷� ����
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age == o.age) {
//			return 0;
//		} else {
//			return 1;
//		}
		// ���� ����
//		if (o.age < this.age) {
//			return -1;
//		} else if (o.age == this.age) {
//			return 0;
//		} else {
//			return 1;
//		}
		// ���� ������� ����(��������)
//		return score.compareTo(o.score);
		// ���� ����
		return o.score.compareTo(score);
		// Integer class�� ���� �������� ��� compareTo()�޼ҵ带 ����� �� �ִ�.
//		return age.compareTo(o.age);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}