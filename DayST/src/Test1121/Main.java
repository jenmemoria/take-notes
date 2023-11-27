package Test1121;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);
		EmployeesDTO employees = null;
		int menu = -1;
		List<EmployeesDTO> list = null;
		
		while(menu != 0) {
			System.out.println("1. 직원 first_name, salary, hire_date 조회");
			System.out.println("2. 직원 연차 목록");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 직원 first_name, salary, hire_date 목록 출력
				list = handler.showList();
				for(EmployeesDTO ob : list) {
					System.out.printf("%s : %d 달러, %s\n",
							ob.getFirst_name(),
							ob.getSalary(),
							ob.getHire_date());
				}
				
				break;
				
			case 2: // 직원 연차 목록
				list = handler.yearswork();
				for(EmployeesDTO ob : list) {
					System.out.printf("%s님 연차 : %d차\n",
							ob.getFirst_name(),
							ob.getYear_diff());
				}
				break;
			}
		}
	}
}
