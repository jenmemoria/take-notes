package phonebook1;

import java.util.ArrayList;

public class PhoneBookDAO {

	// SQL과 다른 인자만 전달하면 쿼리를 수행하고 결과를 돌려주는 객체(도구)
	private JdbcTemplate template = new JdbcTemplate();
	
	// 전체 목록 불러오기
	public ArrayList<PhoneBookDTO> selectList(){
		String sql = "select * from phonebook";	// 또는 "select * from phonebook order by favorite desc, name"
		
		RowMapper<PhoneBookDTO> mapper = rs -> {
			PhoneBookDTO dto = new PhoneBookDTO();
			
			// 컬럼이 많을 때 종래T는 그냥 a, b, c, d순으로 해버린다고 하심.
			dto.setName(rs.getString("name"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setPnum(rs.getString("pnum"));
			return dto;
		};
		return template.queryForList(sql, mapper);
	}
	
	// 전달받은 객체를 DB에 저장하기
	public int insertPhoneBook(PhoneBookDTO dto) {
		int row = 0;
		String sql = "insert into Phonebook values (?, ?, ?, ?)";
		row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());
		return row;
	}
	
	// 연락처 수정하기 (이름을 입력받아서 해당 이름 전번 수정)
	public int updatePhoneBook(String name, String pnum) {
		int row = 0;
		String sql = "update PhoneBook set pnum = ? where name = ?";	// set이 바꾸는 거, where 뒤에는 무조건 =과 ?
		row = template.update(sql, pnum, name);
		return row;
	}
	
	// 이름을 입력받아 해당 이름 즐겨찾기 수정.
	public int updateFavorite(String name) {
		int row = 0;
		String sql = "update PhoneBook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where name = ?";
		row = template.update(sql, name);
		return row;
	}
	
	// 해당 연락처 삭제
	public int deletePhoneBook(String name) {
		int row = 0;
		String sql = "delete Phonebook where name = ?";
		row = template.update(sql, name);
		return row;
	}
}
