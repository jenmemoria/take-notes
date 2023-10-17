package control;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰 수를 화면에 출력하세요
		
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫 번째 정수를 입력하세요 : ");
		a = sc.nextInt();
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}
