package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String arrow = "↑";
		int distance;	// 반복 횟수
		
		System.out.print("0 ~ 30 입력 : ");
		distance = sc.nextInt();
		
		System.out.println("┌────┬────┬────┬────┬────┬────┐");
		System.out.println("│││││││││││││││││││││││││││││││");
		System.out.println("0    5    10   15   20   25   30");
		
		for (int i = 1; i<=distance; i++) {
			System.out.print(" ");
		}
		System.out.print(arrow);
		
		
	}
}
