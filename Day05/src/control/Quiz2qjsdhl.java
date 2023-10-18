package control;

import java.util.Scanner;

public class Quiz2qjsdhl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int pay = 3000;
//		int plus = 500;
//		int time, plustime, pt1, pluspay, totalpay;
//		
//		time = sc.nextInt();
//		
//		if (time <= 30) {
//			System.out.println(pay+"원입니다.");
//		}
//		else if (time > 30) {
//			plustime = time % 30;
//			if (plustime % 10 != 0) {
//				if(time % 10 < 10) {
//					totalpay = pay + plus;
//					System.out.println(totalpay+"원입니다.");
//				}
//				pt1 = plustime * plus;
//				totalpay = pt1 + pay ;
//				System.out.println(totalpay+"원입니다.");
//			}
//			else {
//				plustime = time / 3;
//				pt1 = plustime * plus;
//				totalpay = pt1 + pay;
//				System.out.println(totalpay+"원입니다.");
//			}
//		}
//		
		int time;
		int fee = 3000, over;
		
		time = sc.nextInt();
		if(time > 30) {
			over = ((time - 30) / 10) * 500;
			if(time % 10 != 0) {
				over += 500;
			}
			fee += over;
		}
		
		if (time > 30) {
			fee += (time - 21) / 10 * 500;
		}
		System.out.printf("요금 : %,d원\n", fee);
		sc.close();
	}
}
