package book2;

// 책이름 	(문자열)
// 작가		(문자열)
// 가격 		(정수)
// 출판사		(문자열)

public class Book {
	private String name;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
}
