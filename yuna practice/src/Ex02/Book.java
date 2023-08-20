package Ex02;

public class Book {
	
	int isbn;	// International Standard Book Number : 국제 표준 도서 번호
	String title, writer, content;
	int price;
	
	
	// 기본 생성자
	public Book() {
	}

	// 생성자
	public Book(int isbn, String title, String writer, String content, int price) {
		this.isbn = isbn;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.price = price;
	}
	

	// getter, setter
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", content=" + content + ", price="
				+ price + "]";
	}
	
	
	
}
