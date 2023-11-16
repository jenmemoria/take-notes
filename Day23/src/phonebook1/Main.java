package phonebook1;

import java.util.Scanner;

public class Main {
	static PhoneBookDTO getPhoneBookFromUserInput(Scanner sc) {
		PhoneBookDTO phonebook = new PhoneBookDTO();
		String name, pnum, favorite;
		int age;
		
		System.out.print("추가할 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("전화번호 입력 : ");
		pnum = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("즐겨찾기 여부 입력 : ");
		favorite = sc.nextLine();
		
		phonebook.setName(name);
		phonebook.setPnum(pnum);
		phonebook.setAge(age);
		phonebook.setFavorite(favorite);
		
		return phonebook;
		
	}
	
	public static void main(String[] args) {
		Handler handler = new Handler();
		PhoneBookDTO phonebook = null;
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		int row = 0;
		String name;
		String pnum;
		
		while(menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:	// 1. 전체 출력
				handler.showList();
				break;
			case 2:	// 2. 연락처 추가
				phonebook = getPhoneBookFromUserInput(sc);
				row = handler.insertPhoneBook(phonebook);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;	// 추가하고 나서 break가 없으면 case 0으로 넘어감.
				
			case 3:	// 3. 전화번호 수정
				System.out.print("이름을 입력하세요 : ");
				name = sc.nextLine();
				System.out.print("전화번호를 입력하세요 : ");
				pnum = sc.nextLine();
				row = handler.updatePhoneBook(name, pnum);
				System.out.println(row != 0? "수정 성공" : "수정 삭제");
				break;
				
			case 4:	// 즐겨찾기 수정 ex) "Y" -> "N", "N" -> "Y"
				System.out.print("이름을 입력하세요 : ");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				System.out.println(row != 0? "수정 성공" : "수정 실패");
				break;
				
			case 5:
				// 배열 내부의 전화번호부 중에서 이름이 일치하는 객체를 찾아서 제거한다.
				System.out.print("이름을 입력하세요 : ");
				name = sc.nextLine();
				row = handler.deletePhoneBook(name);
				System.out.println(row != 0? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
			
			}
		}	// end of while
		sc.close();
	}
}
