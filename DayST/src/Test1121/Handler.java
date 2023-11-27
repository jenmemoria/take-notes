package Test1121;

import java.util.List;

public class Handler {
	EmployessDAO dao = new EmployessDAO();	// Connection이 연결된 상태 !

	public List<EmployeesDTO> showList() {
		return dao.showList();
	}

	public List<EmployeesDTO> yearswork() {
		return dao.yearswork();
	}

}
