package javaHigh08.example05;

public class User1Thread extends Thread {
	private Calculator calculator;

	public User1Thread() {
		// Thread의 이름을 넣어줌
		setName("User1Thread");
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
//		calculator.setMemory1(100);
		calculator.setMemory2(100);
	}

}
