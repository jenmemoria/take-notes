package phonebook2;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class PhoneBookDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";

	private Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.river.OracleDriver");
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	public List<PhoneBookDTO> selectList() throws Exception{
		
		// DB 연결하는 것 : conn -> stmt -> rs/row
		// 리스트에서 파일을 거쳐서 DB로 저장소를 변경한다.
		ArrayList<PhoneBookDTO> list = new ArrayList<>();
		
		String sql = "select * from phonebook order by favorite  desc, name asc";
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			// RowMapper에 작성했던 규칙을 여기에 작성
			PhoneBookDTO dto = new PhoneBookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setIdx(rs.getInt("idx"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			
			list.add(dto);
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
		
//		try {
//			pstmt = conn.prepareStatement(sql);	// 쿼리문을 탑재하여 실행 준비
//			rs = pstmt.executeQuery();
//			while(rs.next()) {
//				PhoneBookDTO dto = new PhoneBookDTO();
//				dto.setAge(rs.getInt("age"));
//				dto.setFavorite(rs.getString("favorite"));
//			}
//		}
//		return null;
	}
	// 전달받은 객체를 DB에 저장하기
	public int insertPhoneBook(PhoneBookDTO dto) throws SQLException {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?, ?)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, dto.getIdx());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getPnum());
		pstmt.setInt(4, dto.getAge());
		pstmt.setString(5, dto.getFavorite());
		row = pstmt.executeUpdate();
		
		rs.close();
		pstmt.close();
		conn.close();
		return row;
	}
	
	// 연락처 수정하기 (인덱스를 입력받아서 해당 전번 수정)
	public int updatePhoneBook(int idx) throws Exception {
		int row = 0;
		conn = getConnection();
		String sql = "update phonebook set pnum = ? where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		
		return row;
	}
	
	// 즐겨찾기 수정하기 (인덱스를 입력받기)
	public int updateFavorite(int idx) throws SQLException {
		int row = 0;
		String sql = "update PhoneBook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		pstmt.setString(3, pnum);
		row = pstmt.executeUpdate();
		
		return row;
	}
	
	public int deleteBook(int idx) throws SQLException {
		int row = 0;
		String sql = "delete from phonebook where idx = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		
		return row;
	}
}
