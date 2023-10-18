package control;

import java.util.Scanner;
// 이클립스 디버깅하기
// 1) 중단점을 설정한다. (Ctrl + shift + b) or 줄 번호 왼쪽 클릭
// 2) F11번을 눌러서 디버깅을 시작한다. (화면 구성을 바꿀 건지 물어보면 yes)
// 3) F6번을 누를 때마다 한 줄씩 실행되고, 우측에서 변수의 값을 확인할 수 있다.

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String gender ="";
		int num1, num2, age, month, year;
		
		System.out.println("주민등록번호 13자리 입력(xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		switch(num2 / 1000000) {
		case 1: case 2:		age = 1900+(num1/10000);
							month = num1 / 100 % 100;
							year = num1 % 100;
							break;
		default:			age = 2000+(num1/10000);
							month = num1 / 100 % 100;
							year = num1 % 100;
		}
		
		switch(num2 / 1000000) {
		case 1: case 3:		gender = "남자";	break;
		default:			gender = "여자";
		}
		System.out.printf("출생연도 : %d, 출생월 : %d, 출생일 : %d, 성별 : %s\n",age, month, year, gender);
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요.
		
		/*
		 int year, month, date, genderNumber;
		 String gender = "";
		 
		 // 0의 개수만큼 오른쪽 숫자를 가져온다.								// num1		year	month	date
		 date = num1 % 100;		//0의 개수만큼 오른쪽 숫자를 가져온다.		// 930516	?		?		16
		 
		 num1 /= 100;												// 9305		?		?		16
		 
		 month = num1 % 100;										// 9305		?		5		16
		 
		 year = num1 / 100;											// 9305		93		5		16
		 
		 genderNumber = num2 / 1000000;
		 
		 switch(genderNumber){
		 case 1: case 2:
		 	year += 1900;
		 	break;
		 case 3: case 4:
		 	year += 2000;
		 	break;
		 }
		 
		 switch (genderNumber){
		 case 1: case 3:
		 	gender = "남성";
		 	break;
		 case 2: case 4:
		 	gender = "여성";
		 	break;
		 default :
		 	gender = "";
		 }
		 
		 System.out.printf("%4d-%02d-%02d (%s)\n", year, month, date, gender);
		 % : 서식, d : 10진수, 2: 2자리 확보 후 출력, 0 : 빈 칸이 있으면 0으로 채우기.
		 * */
		
		
	}
}
