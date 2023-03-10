package javaHigh05.example04;

public class Movie implements Comparable<Movie>{
	private String movieName;
	private Integer ticket;

	public String getMovieName() {
		return movieName;
	}

	public Integer getTicket() {
		return ticket;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setTicket(Integer ticket) {
		this.ticket = ticket;
	}

	public Movie(String movieName, Integer ticket) {
		super();
		this.movieName = movieName;
		this.ticket = ticket;
	}
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.movieName.compareTo(o.getMovieName());
	}
}
