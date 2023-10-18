package control;

import java.util.Random;

public class Quiz2 {
	public static void main(String[] args) {
		
/*
 		놀이공운에 있는 놀이기구에 대한 이용 요금을 계산해야 한다.
 		이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
 		이용 시간에 따라 추가 요금이 발생한다.
 		그 시간과 요금은 아래와 같다.
 		
 		시간			요금
 		0 ~ 30		3000
 		31 ~ 40		3500
 		41 ~ 50		4000
 		...
 		
 		시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요.
 		
 */
		Random ran = new Random();
		int time = ran.nextInt(120);
		int plustime, pt1;
		int pay, totalpay;
		int pluspay = 500;
		
		if (time <= 30) {
			pay = 3000;
		}
		else if (time > 30) {
			if (time % 30 != 0) {
				if (time % 30 <= 10) {
					pay = 3000;
					totalpay = pay + pluspay;
				}
				else {
					pay = 3000;
					plustime = time % 30;
					pt1 = plustime / 10;
					pluspay *= pt1;
					totalpay = pay + pluspay;
				}
				System.out.println("시간을 분으로 입력하세요 : " + time);
				System.out.printf("%d원 입니다.", totalpay);
			}
		}
	}
}
