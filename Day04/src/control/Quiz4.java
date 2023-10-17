package control;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다.
		// 이동한 구간 수를 입력받아서 이동하는데 걸리는 시간을 출력하세요.
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분 초과하면 시간과 분으로 나누어서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int onest = 4;
		int totalst = 0;
		int hour = 0;
		
		System.out.printf("이동한 구간 수를 입력하세요 : ");
		totalst = sc.nextInt();
		
		hour = totalst / 15;
		
		if ((onest * totalst) % 60 == 0) {
			System.out.printf("%d시간\n", hour);
		}
		else if (totalst > 15) {
			hour = totalst / 15;
			System.out.printf("%d시간 %d분\n", hour, (onest*totalst)%12);
		}
		else {
			System.out.printf("%d분", onest*totalst);
		}
		sc.close();
	}
}
