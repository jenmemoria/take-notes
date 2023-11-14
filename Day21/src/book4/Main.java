package book4;

import java.util.Scanner;

public class Main {
	// case2의 입력부분, Scanner를 매개변수로 전달받아서 객체를 생성하고, 
	// 사용자 입력값으로 객체를 구성하여 그 객체를 반환하는 함수
	public static Book getBookFromUserInput(Scanner sc) {
		Book book = new Book();
		
		String name, author, publisher;			
		int price;
		
		System.out.print("도서 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("저자명 입력 : ");
		author = sc.nextLine();

		System.out.print("출판사명 입력 : ");
		publisher = sc.nextLine();
		
		System.out.print("도서 가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setAuthor(author);
		book.setName(name);
		book.setPrice(price);
		book.setPublisher(publisher);
		return book;
	}
	
	// 도서 이름을 전달받아서 일치하는 객체를 찾아서 삭제하는 함수
	
	public static void main(String[] args) {	// 메인은 순수하게 입출력만 가능하게, 나중에 메인에 다 섞여있으면 유지보수가 어려울 수 있다.
		// 변수 선언
		Handler handler = new Handler();
		Book book = null;						// 추가 수정 삭제 검색에서 사용할 객체를 받기 위한 변수
		Scanner sc = new Scanner(System.in);	// 입력받기 위한 Scanner
		int menu = -1;							// switch와 연동하기 위한 메뉴
		String name;
		int row = 0;							// 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수
		
//		String name, author, publisher;			// Book와 String 타입 필드 (입력받기 위한 값)
//		int price;								// Book의 int 타입 필드 (입력받기 위한 값)
			
												// 배열은 자료형에 맞는 0값으로 초기화된다.
												// 참조형 변수 (클래스 타입 변수)의 초기값은 null
		// arr = {null, null, null, null, null, null, null, null, null, null};
		
		// 입력 및 출력
		while(menu != 0) {
			// 사용자 메뉴 출력
			System.out.println("1. 전체 출력");
			System.out.println("2. 도서 추가");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다. (분기문)
			case 1:			// 1. 전체 출력
				handler.showList();
				break;
			case 2:			// 2. 도서 추가
				book = getBookFromUserInput(sc);	// 이미 값이 모두 세팅, 기능을 분산하려고 하는 건 아님 !!
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;	// 추가하고 나서 break가 없으면 case0으로 넘어가버리니까 switch의 break
			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거한다.
				System.out.print("검색어를 입력하세요 : ");
				name = sc.nextLine();
				
				row = handler.deleteBook(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0:			// 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
}	// end of class Main
