package Test1121;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployessDAO {

	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("연결 문제 발생 : " + e);
		}
		return conn;
	}
	
	private void close() {
		try {
			if(rs != null)		rs.close();
			if(pstmt != null)	pstmt.close();
			if(conn != null)	conn.close();
		}catch(Exception e)	{}
	}
	
	public List<EmployeesDTO> showList() {
		ArrayList<EmployeesDTO> list = new ArrayList<>();
		String sql = "select * from employees"; // select * from employees order by years work desc, name
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmployeesDTO dto = new EmployeesDTO();
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		return list;
	}

	public List<EmployeesDTO> yearswork() {
		ArrayList<EmployeesDTO> list = new ArrayList<>();
		String sql = "select first_name, extract(year from sysdate) - extract(year from hire_date) as year_diff from employees order by year_diff desc";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmployeesDTO dto = new EmployeesDTO();
				dto.setFirst_name(rs.getString("first_name"));
//				dto.setSalary(rs.getInt("salary"));
//				dto.setHire_date(rs.getDate("hire_date"));
				dto.setYear_diff(rs.getInt("year_diff"));
				list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		return list;
	}

}
