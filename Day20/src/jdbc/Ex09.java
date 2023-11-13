package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class DAO {	// 음료수 보충한다던지, 이런 행위에 대한 클래스 DAO
			// Handler와 비슷한 클래스, 단 둘이 같이 쓰면 안 됨.
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String username = "hr";
	private final String password = "hr";
	
	private final String driverName = "oracle.jdbc.driver.OracleDriver";
	
	public DAO() {		// DAO 객체를 생성하면 드라이버 로드 및 연결을 수행한다. (객체 생성 시 초기작동)
						// 함수를 어떻게 써야할지 고민을 해야한다.
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, username, password);
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 이름이 잘못되었습니다. : " + e);
//			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB에 접속하는데 문제가 발생했습니다. : " + e);
//			e.printStackTrace();
		}
	}
	
	// DB에 접속하여 직원의 이름과 급여를 가져와서 리스트 형태로 반환하는 함수
	public List<DTO> getQueryFromEmployees() throws SQLException{
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select first_name, salary from employees";
		stmt = conn.createStatement();	// 이미 접속이 수행되었으니, 상태 체크부터 시작.
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			
			// 빈 객체를 생성한다.
			DTO dto = new DTO();
			
			// DB에서 first_name을 문자열 형태로 가져와서 객체에 저장한다.
			dto.setFirstName(rs.getString("first_name"));
			
			// DB에서 salary를 정수 형태로 가져와서 객체에 저장한다.
			dto.setSalary(rs.getInt("salary"));
			
			// 객체를 리스트에 추가한다.
			list.add(dto);
			
		}
		rs.close();	// 닫아줄 때는 역순으로 닫아줘야 한다.
		stmt.close();
		return list;
	}
	
}



class DTO { // Data Transfer Object, DB <-> Program 사이로 데이터를 주고받기 위해 사용하는 객체
			// 값을 저장하기 위한 객체.
			
	private String firstName;
	private int salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
public class Ex09 {	
	public static void main(String[] args) throws Exception {	// 메인에서는 주요 시나리오.
		
		DAO dao = new DAO();	// DB에 접속해서
		
		List<DTO> list = dao.getQueryFromEmployees();		// 원하는 데이터를 리스트 형태로 가져와서
		
		// 모두 출력한다. (끝)
		list.forEach(ob -> System.out.printf("%s : $%,d\n", ob.getFirstName(), ob.getSalary()));
	}
}
