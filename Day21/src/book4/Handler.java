package book4;

import java.util.ArrayList;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음.
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스
// 다 적고 생각 : 메인함수에는 아무런 영향이 없다. (메인함수는 수정 아무것도 안 함. 완벽하게 분리)

public class Handler {
//	private Book[] arr = new Book[10];	// 여러 Book 객체를 	
	// 배열은 자료형에 맞는 0값으로  초기화 된다.
	// 참조형 변수 (클래스 타입 변수)의 초기값은 null
	
	// 배열에서 리스트로 전환 (배열의 자료형은 리스트의 제네릭 타입이 된다.)
	private ArrayList<Book> list = new ArrayList<>();
	
	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	public void showList() {	// 1, 2, 3, 4 중에서 선택 ! (그 대신 1, 2는 알고 있어야해)
		// 1) index를 사용하는 for문
//		for(int i = 0; i < list.size(); i++) {
//			Book ob = list.get(i);
//			System.out.println(ob);			 
//			}
		
		// 2) 향상된 for문 (index를 사용하지 않음)
//		for(Book ob : list) {
//			System.out.println(ob);
//		}	
		
		// 3) 람다식 + 컬렉션 forEach()
		list.forEach(ob -> System.out.println(ob));
		
		// 4) 메서드 참조
//		list.forEach(System.out::println);	// 더블콜론(::) : 메서드를 참조하는 연산자.
	}
	
	// 도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] == null) {		// 빈칸을 찾았다면
//				arr[i] = ob;			// 값이 준비된 객체를 넣으면 끝.
//				row = 1;
//				break;		// 다음칸에 또 값을 넣으면 안 되니까 break(반복 중단)
//				
//				// 파랑색 변수 : 클래스의 멤버필드
//				// 갈색 변수 : 메인함수의 지역변수
//			}
//		}
		boolean flag = list.add(ob);	// 추가 성공하면 true가 반환된다.
		row = flag ? 1 : 0;				// true이면 row가 1, 아니면 row가 0
		
		return row;
	}
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 삭제한다.
	int deleteBook(String name) {	// 책이 Book 타입 안에 있으니까 !!
		int row = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] != null && arr[i].getName().equals(name)) {
//				// arr[i] != null은 NullPointException을 방지하기 위해서 !
//				arr[i] = null;	// 참조변수가 객체를 참조하지 않도록 한다.
//								// 모두에게서 잊혀진 참조변수는 소멸한다.
//				row = 1;		// 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다.
//				break;			// 하나 지웠으면 중단한다.
//				
//			}
//		}
		
		// 조건에 맞는 요소를 삭제하는 리스트의 함수 (반환값은 boolean 타입)
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		// removeIf는 조건에 맞는 요소들을 찾아서 다 지운다.
		// 그래서 기본키가 필요하다는 생각을 머릿속에 생각을 해야한다.
		row = flag ? 1 : 0;
		return row;
	}
}
