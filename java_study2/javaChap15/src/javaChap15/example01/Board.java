package javaChap15.example01;

public class Board implements Comparable<Board>{
	private String subject;
	private String content;
	private String writer;
	@Override
	public int compareTo(Board o) {
		// TODO Auto-generated method stub
		return this.subject.compareTo(o.subject);
	}
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
