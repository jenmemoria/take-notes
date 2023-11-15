package book6;

//create table book (
//	    name            varchar2(100),
//	    author          varchar2(100),
//	    publisher       varchar2(100),
//	    price           number
//	);
// 앞으로는 테이블의 ★ 컬럼의 내용대로 멤버 필드를 작성한다.
// 멤버필드에 private을 적용하고, getter/setter를 public으로 작성한다.
// 생성자 오버로딩이나 toString 오버라이딩은 상관없지만
// 반드시 기본 생성자가 존재하도록 구성해야 한다.

public class BookDTO {	// Data Transfer Object (DB <-> Program) 사이를 왔다갔다 해주는 
						// 이클립스 (윈도우에서 실행), Oracle (리눅스에서 실행) => 서로 다른 컴퓨터에서 실행
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
