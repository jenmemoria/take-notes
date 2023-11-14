package book1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);	// 입력받기 위한 Scanner
		int menu = -1;							// switch와 연동하기 위한 메뉴
		String name, author, publisher;			// Book와 String 타입 필드 (입력받기 위한 값)
		int price;								// Book의 int 타입 필드 (입력받기 위한 값)
		
		Book[] arr = new Book[10];				// 여러 Book 객체를 저장하기 위한 배열
												// 배열은 자료형에 맞는 0값으로 초기화된다.
												// 참조형 변수 (클래스 타입 변수)의 초기값은 null
		// arr = {null, null, null, null, null, null, null, null, null, null};
		
		// 입력 및 출력
		while(menu != 0) {
			// 사용자 메뉴 출력
			System.out.println("1. 전체 출력");
			System.out.println("2. 도서 추가");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다. (분기문)
			case 1:			// 1. 전체 출력
				 for(int i = 0; i < arr.length; i++) {
					 if(arr[i] != null) {	// 배열의 각 초기값 null을 처리(회피)하기 위한 if
						 System.out.printf("%s (%s, %s) : %,d원\n",
								 arr[i].name, arr[i].author, arr[i].publisher, arr[i].price);						 
					 }
				 }
				break;
			case 2:			// 2. 도서 추가
				System.out.print("도서 이름 입력 : ");
				name = sc.nextLine();
				
				System.out.print("저자명 입력 : ");
				author = sc.nextLine();

				System.out.print("출판사명 입력 : ");
				publisher = sc.nextLine();
				
				System.out.print("도서 가격 입력 : ");
				price = Integer.parseInt(sc.nextLine());
				
				// 4개의 값을 입력받았다면 하나의 객체로 구성하기 위해서 생성자를 호출한다.
				// 배열의 10칸 중에서 빈칸을 하나 찾아서 거기에 객체를 생성하고 값을 넣어준다.
				// 다음 칸에도 똑같은 값을 넣으면 안 되니까 break를 수행해야 한다.
				for (int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {		// 빈칸을 찾았다면
						arr[i] = new Book();	// 빈칸에 객체를 생성하고
						arr[i].name = name;		// Scanner로 입력받은 값을 객체의 속성으로 대입한다.
						arr[i].author = author;
						arr[i].publisher = publisher;
						arr[i].price = price;
						break;		// 다음칸에 또 값을 넣으면 안 되니까 break(반복 중단)
						
						// 파랑색 변수 : 클래스의 멤버필드
						// 갈색 변수 : 메인함수의 지역변수
					}
				}
				break;	// 추가하고 나서 break가 없으면 case0으로 넘어가버리니까 switch의 break
			case 0:			// 0. 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}
}	// end of class Main
