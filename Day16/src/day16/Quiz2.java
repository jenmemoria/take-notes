package day16;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Student1[] arr = new Student1[5];
		Scanner sc = new Scanner(System.in);
		
//		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = new Student1();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("점수 입력 : ");
				int score = sc.nextInt();
				arr[i].setName(name);
				arr[i].setScore(score);
			}
		}
		System.out.println("=== 입력 완료 === ");
		System.out.println("=== 출력 시작 === ");
		
		// 배열의 내용을 출력하기
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s : %d점\n", arr[i].getName(), arr[i].getScore());
				
			}
		}
		
		sortMemberArrayByAge(arr);
		System.out.println("=== 출력 완료 === ");
		
		sc.close();
		
		
	}
	
	static void sortMemberArrayByAge(Student1[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].getScore() - arr[j].getScore() > 0) {
					Student1 tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}


