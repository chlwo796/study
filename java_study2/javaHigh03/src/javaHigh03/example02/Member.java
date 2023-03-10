package javaHigh03.example02;

public class Member {

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

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
	// 이름이 같고 나이가 같으면 같은사람(동등객체)라는 것을 프로그램으로 작성하기
	// 1. hashcode() 2. equals()
	// hashCode()수행과 equals()수행은 별도로 메소드 호출하지 않아도 Set 객체가 자동호출한다.
	@Override
	public int hashCode() {
		// 개발자가 hashCode()를 재정의
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
//		obj 변수에는 2번째로 set 안에 들어갈 자료의 주소가 들어있다.
//		target.name = 들어갈 자료의 이름, this.name = 들어있는 자료의 이름
		if(obj instanceof Member) {
			Member target = (Member) obj;
			return target.name.equals(this.name) && target.age == this.age;
		}
		return false;
	}
}