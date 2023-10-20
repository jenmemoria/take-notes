package loop;

public class Exqu03 {
	public static void main(String[] args) {
		// for문 기본 연습 문제
		
		// 1) 1에서 10 사이 정수의 합계를 구하여 출력하세요.
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}System.out.println(sum);
		
		// 2) 11에서 20사이 정수의 합계를 구하여 출력하세요.
		sum = 0;
		for(int i = 11; i < 21; i++) {
			sum += i;
		}System.out.println(sum);
		
		// 3) 5에서 0까지 세로로 출력하세요.	
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
