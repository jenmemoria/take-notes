package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(10)+1;
		int user;
		int count = 1;
		
		// 반복을 수행하면서 
		// 사용자에게 값을 입력받고
		// 만약 정답이 입력값보다 작으면 DOWN, 크면 UP
		// 일치하면 반복을 중단.
		// 반복할 때마다 횟수를 증가시키기.
		
		// 반복이 끝나면 정답과 횟수를 출력하고 종료.
		
		while (true) {
			System.out.println("정답을 입력하세요 : ");
			user = sc.nextInt();
			if (user != answer) {
				count += 1;
				if (user < answer) {
					System.out.println("UP");
				}
				else if (user > answer) {
					System.out.println("DOWN");
				}
			}
			else {
				System.out.printf("정답 : %d, 시도 횟수 : %d\n", answer, count);
				break;
			}
		}
		
		
		
//		while (user != answer) {
//			count += 1;
//			System.out.println("정답을 입력하세요 : ");
//			user = sc.nextInt();
//			
//			if(user > answer) {
//				System.out.println("DOWN");
//				
//			}
//			else if (user < answer) {
//				System.out.println("UP");
//			}
//		}
		
		
	}
}
