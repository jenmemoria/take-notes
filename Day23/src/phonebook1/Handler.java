package phonebook1;

import java.util.List;

public class Handler {
	
	// 전체 목록 출력
	public void showList() {
		PhoneBookDAO dao = new PhoneBookDAO();		// Connection이 연결된 상태
		List<PhoneBookDTO> list = dao.selectList();	// DB에 저장된 데이터를 불러온다.
		list.forEach(ob -> System.out.println(ob));
	}
	
	// 폰북 추가
	public int insertPhoneBook(PhoneBookDTO ob) {
		int row = 0;
		PhoneBookDAO dao = new PhoneBookDAO();
		row = dao.insertPhoneBook(ob);		// 메인이 넘겨준 객체를 dao로 전달하여 추가한다.
		return row;
	}
	
	// 전화번호 수정
	public int updatePhoneBook(String name, String pnum) {
		int row = 0;
		PhoneBookDAO dao = new PhoneBookDAO();
		row = dao.updatePhoneBook(name, pnum);
		return row;
		
	}
	
	// 즐겨찾기 수정
	public int updateFavorite(String name) {
		int row = 0;
		PhoneBookDAO dao = new PhoneBookDAO();
		row = dao.updateFavorite(name);
		return row;
	}
	// 폰 주인 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deletePhoneBook(String name) {
		int row = 0;
		PhoneBookDAO dao = new PhoneBookDAO();
		row = dao.deletePhoneBook(name);
		return row;
	}
}
