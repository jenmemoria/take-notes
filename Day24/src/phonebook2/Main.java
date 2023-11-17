package phonebook2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Handler handler = new Handler();
		PhoneBookDTO phonebook = null;
		List<PhoneBookDTO> list = null;
		Scanner sc = new Scanner(System.in);
		int idx;
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
//			System.out.println("6. 순번 조회하기");
			System.out.println("0. 종료");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:	// 전체 목록 출력
				handler.showList();
				break;
			case 2:	// 연락처 추가
				phonebook = getPhoneBookFromUserInput(sc);
				row = handler.insertPhoneBook(phonebook);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
				
			case 3:	// 인덱스를 입력받아 전화번호 수정
				System.out.print("인덱스를 입력하세요 : ");
				idx = sc.nextInt();
				System.out.print("전화번호를 입력하세요 : ");
				pnum = sc.nextLine();
				row = handler.updatePhoneBook(name, pnum);
				System.out.println(row != 0? "수정 성공" : "수정 실패");
				break;
			case 4:
			case 5:
			case 0:
			}
		} // end of while
		sc.close();
	}

	private static PhoneBookDTO getPhoneBookFromUserInput(Scanner sc) {
		// TODO Auto-generated method stub
		return null;
	}
}
