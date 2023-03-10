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
		// 이름으로 정렬, String 클래스에 있는 메소드 compareTo()를 호출하여 정렬작업수행
//		return name.compareTo(o.name);
		// 이름 거꾸로 정렬
//		return o.name.compareTo(name);
		// 나이로 정렬
//		if (this.age < o.age) {
//			return -1;
//		} else if (this.age == o.age) {
//			return 0;
//		} else {
//			return 1;
//		}
		// 나이 역순
//		if (o.age < this.age) {
//			return -1;
//		} else if (o.age == this.age) {
//			return 0;
//		} else {
//			return 1;
//		}
		// 점수 순서대로 정렬(오름차순)
//		return score.compareTo(o.score);
		// 점수 역순
		return o.score.compareTo(score);
		// Integer class로 변수 선언했을 경우 compareTo()메소드를 사용할 수 있다.
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

}
