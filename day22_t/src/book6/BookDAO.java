package book6;

import java.sql.*;	// 자바에서 DB에 접속하기 위한 클래스를 가져온다
import java.util.ArrayList;

// Oracle전용 접속 드라이버는 라이브러리 파일을 가져와야 한다

public class BookDAO {

	private Connection conn;	// 접속 1단계, 네트워크 및 포트 접속을 확인
//	private Statement stmt;		// 접속 2단계, 접속된 DB프로그램이 작업을 수행할 수 있는 상태인지 확인
	private PreparedStatement pstmt;	// Statement의 서브클래스(상속) pstmt
	private ResultSet rs;		// 만약 수행하는 쿼리가 select이면 결과를 받아서 저장한다
								// insert, update, delete는 결과를 int 형태로 반환한다

	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	public BookDAO() {
		try {
			// Oracle DB에 접속하기 위한 전용 드라이버
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("생성자 예외 발생 : " + e);
			e.printStackTrace();
		} 
	}
	
	// 전체 목록 불러오기
	public ArrayList<BookDTO> selectList() throws SQLException {
		// conn -> stmt -> rs/row
		ArrayList<BookDTO> list = new ArrayList<>();	// 반환값 준비
		String sql = "select * from book";				// 실행할 쿼리문 준비
		
		pstmt = conn.prepareStatement(sql);	// 쿼리문을 탑재하여 실행 준비
		rs = pstmt.executeQuery();			// 실행해서 결과를 rs에 저장 (컨트롤 엔터:쿼리문 실행)
		
		while(rs.next()) {	// 불러온 결과를 한줄씩 처리하기 위해 반복문 (다음줄이 있으면 실행)
			BookDTO dto = new BookDTO();
			dto.setAuthor(rs.getString("author")); // 컬럼 이름을 지정해서 문자열로 불러온다
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price")); // 정수로 불러오고 싶으면 getInt
			dto.setPublisher(rs.getString("publisher"));
			list.add(dto);
		}
		rs.close();		
		pstmt.close();
		conn.close();
		return list;
	}


	// 전달받은 객체를 DB에 저장하기
	public int insertBook(BookDTO dto) throws SQLException {
		int row = 0;
		String sql = "insert into book values (?, ?, ?, ?)";	// 쿼리문 형식만 준비
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName()); 	// setString은 따옴표처리도 자동으로 수행한다
		pstmt.setString(2, dto.getAuthor());
		pstmt.setString(3, dto.getPublisher());
		pstmt.setInt(4, dto.getPrice());	// setInt는 따옴표를 처리하지 않는다
		row = pstmt.executeUpdate();	// insert/update/delete를 수행하고 int로 받는다
		
		rs.close();		// 통로 개설의 역순으로 닫아준다
		pstmt.close();
		conn.close();
		return row;
	}

	public int deleteBook(String name) throws SQLException {
		int row = 0;
		String sql = "delete book where name = ?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		row = pstmt.executeUpdate();
		
		return row;
	}
	
}














