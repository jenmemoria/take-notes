package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex08 {
	// ojdbc8-23.2.0.0.jar 파일을 프로젝트에 끌어다 놓기
	// 프로젝트 우클릭 - 맨 아래 속성 (properties) -
	
	public static void main(String[] args) throws Exception {
		
		String username = "hr";	// DB 접속 이름
		String password = "hr";	// DB 접속 비밀번호
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";	// DB 접속 주소
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 접속에 사용할 오라클 DB 전용 드라이버를 불러온다.
		// 소문자는 패키지, 대문자로 시작하면 클래스
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 주소와 계정정보를 이용하여 DB에 대한 연결을 만들어낸다.
		conn = DriverManager.getConnection(url, username, password);
		
		// 연결 상태를 확인하고, 상태가 정상이면 명령어를 전달할 준비를 수행한다.
		stmt = conn.createStatement();
		
		// ----------------------이까지가 접속하는 거 ----------------------------
		
		// DB에 전달할 명령어를 문자열 형태로 준비한다.
		String sql = "select first_name, salary from employees order by salary desc";
		
		// 명령어를 전달하여 결과를 받는다. (ResultSet : 결과 집합)
		rs = stmt.executeQuery(sql);
		
		// 결과의 줄 수(record, row)만큼 반목문을 수행하여 결과를 한줄씩 출력한다.
		while(rs.next()) {
			String firstName = rs.getString("first_name");
			int salary = rs.getInt("salary");
			System.out.printf("%s : $%,d\n",firstName, salary);
			
		}
		System.out.println("=== 출력 끝 ===");
		
		// 연결을 종료할 때는 접속의 역순으로 끊어준다.
		rs.close();
		stmt.close();
		conn.close();
	}
}
