package javaMid5.ex12;

public class Example {

	public static void main(String[] args) {
//		chap06.ex12
		action(new A());
		action(new B());
		action(new C());

	}

	public static void action(A a) {
		a.method1();
		if (a instanceof C) {
			C c = (C) a;
			c.method2();
		}
	}
}