package ex04_api;

public class Book {
	String bookName;
	String writer;
	
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		String str = "책 제목 : " + this.bookName + ", 저자 : " + this.writer;
		return str;
	}
	
}
