package accessModifier;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// Human 클래스를 이용하여 비어있는 상태의 객체를 하나 생성하세요.
		
		// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
		// 한 줄에 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		Human ob;
		
		ob = new Human();
		
		String name;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		ob.setName(name);
		ob.setAge(age);
		
		System.out.printf("이름 : %s , 나이 : %d살 \n", ob.getName(), ob.getAge());
		
		
		
	}
}
