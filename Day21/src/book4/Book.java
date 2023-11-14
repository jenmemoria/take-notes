package book4;

// 책이름 	(문자열)
// 작가		(문자열)
// 가격 		(정수)
// 출판사		(문자열)

// 접근제한자 + getter/setter 적용
public class Book {
	private String name;		// 클래스 내부에서는 자유롭게 접근이 가능하다. 
	private String author;
	private int price;
	private String publisher;
	
	// 출력 서식을 tostring으로 오버라이딩
	
	@Override
	public String toString() {
		String data = String.format("%s (%s, %s) : %,d원\n",
				name, 			// 여기서 getter으로 하면 함수 종료하고 다시 하고 번거롭게 때문에, 클래스 내부에서는 자유롭게 접근 가능
				author, 
				publisher, 
				price);
		return data;
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
