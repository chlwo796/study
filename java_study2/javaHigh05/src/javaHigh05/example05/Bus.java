package javaHigh05.example05;

public class Bus {
	private String destination;
	private Integer stop;

	public Bus(String destination, Integer stop) {
		super();
		this.destination = destination;
		this.stop = stop;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getStop() {
		return stop;
	}

	public void setStop(Integer stop) {
		this.stop = stop;
	}
}
