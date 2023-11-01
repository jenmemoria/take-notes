package book;

// 1) 단일데이터의 배열
// 2) 데이터를 제어하기 위한 함수들
public class Handler {
	
	private Book[] arr = new Book[5];
	
	public void add(String bookName, String author, int bookPrice) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setBookName(bookName);
				arr[i].setAuthor(author);
				arr[i].setBookPrice(bookPrice);
				break;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s / %s / %d\n", bookName, author, bookPrice );
			}
		}
	}

}
