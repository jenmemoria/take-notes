package accessModifier;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Human 타입의 객체를 저장할 수 있는 배열을 준비
		// while, switch ~ case를 이용하여 메뉴를 선택
		// 메뉴 선택에 따라 입력 및 출력을 수행하는 프로그램

		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		// Human 객체를 담을 수 있는 빈칸이 연속으로 5칸 있다.
		int menu;
		String name;
		int age;
		boolean hasNull;

		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1: // 빈칸을 찾아서 빈칸에 데이터를 입력하고 반복탈출
					// 만약 모든 칸이 채워져서 빈 칸이 없으면 메시지 출력
				hasNull = false;
				// 여러 칸 중에 빈칸인 곳을 하나 찾아서
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == null) {
						hasNull = true;
						// 2) 객체를 구성할 값을 사용자로부터 입력 받고
						System.out.print("이름 입력 : ");
						name = sc.nextLine();
						System.out.print("나이 입력 : ");
						age = Integer.parseInt(sc.nextLine());
//						age = sc.nextInt();
						// 3) 빈칸에 객체를 생성한 다음 값을 넣어준다 (setter)
						arr[i] = new Human();
						arr[i].setName(name);
						arr[i].setAge(age);
						// 4) 빈 칸을 찾아서 데이터를 입력했으니 입력을 중단한다.
						break;	// 다음 칸이 빈칸인지 확인할 필요가 없다. (이미 입력했으니까)
					}
				}if(hasNull == false) {
					System.out.println("=== 빈칸이 없습니다. ===\n");
				}
				break;
			case 2:
				for (int i = 0; i < arr.length; i++) { // getter getter
					if (arr[i] != null) { // i번째 칸이 빈칸이 아니면
											// arr에는 Human 타입의 데이터만 들어갈 수 있으므로
											// 빈칸이 아니면, Human 타입의 객체가 있다는 이야기이다.
						System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
					}
				} // 빈칸을 제외한 모든 데이터를 화면에 출력
					// 모든 칸이 비어 있으면 아무것도 출력하지 않는다.
				break;
			case 0:
				sc.close();
				return; // main 함수를 즉시 종료한다.
			default:
				System.out.println("잘못 선택하셨습니다.");
			}
			System.out.println();
		} // end of while

	}// end of main
} // end of class
