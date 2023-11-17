package phonebook2;

import java.sql.SQLException;
import java.util.List;

public class Handler {
	
	// 전체 목록 출력
	public void showList() throws Exception  {
		PhoneBookDAO dao = new PhoneBookDAO();	// connectiond이 연결된 상태
		List<PhoneBookDTO> list = dao.selectList();	// DB에 저장된 데이터를 불러온다.
		list.forEach(ob -> System.out.println(ob));
		
	}
	
	// 폰북 추가
	public int insertPhoneBook(PhoneBookDTO ob) throws SQLException {
		int row = 0;
		PhoneBookDAO dao = new PhoneBookDAO();
		row = dao.insertPhoneBook(ob);
		return row;
	}

	public int updatePhoneBook(String name, String pnum) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
