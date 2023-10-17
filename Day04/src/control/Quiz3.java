package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 세로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
//		int a, b, c;
//		
//		System.out.printf("첫 번째 정수를 입력하세요 : ");
//		a = sc.nextInt();
//		
//		System.out.printf("두 번째 정수를 입력하세요 : ");
//		b = sc.nextInt();
//		
//		System.out.printf("세 번째 정수를 입력하세요 : ");
//		c = sc.nextInt();
//		
//		if (a >= b && b > c) {
//			System.out.printf("%d가 제일 큽니다.",a);
//		}
//		else if (a <= b && b>=c ) {
//			System.out.printf("%d가 제일 큽니다.", b);
//		}
//		else {
//			System.out.printf("%d가 제일 큽니다. ", c);
//		}
		
		int n1, n2, n3, max;
		
		System.out.printf("첫 번째 정수를 입력하세요 : ");
		n1 = sc.nextInt();
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		n2 = sc.nextInt();
		
		System.out.printf("세 번째 정수를 입력하세요 : ");
		n3 = sc.nextInt();
		
		if(true)		max = n1;		// 값이 없으니 일단 n1을 대입해둔다.
		if(max < n2)	max = n2;		// 최대값보다 n2가 더 크면 n2를 최대값으로 지정한다.
		if(max < n3)	max = n3;		// 최대값보다 n3가 더 크면 n3를 최대값으로 지정한다.
		
		System.out.println("가장 큰 수 : " + max);
		sc.close();
	}
}
