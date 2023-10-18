package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다. 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다.
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주 1병 (4500원), 맥주 1병(5000원)을 고정으로 주문했다.
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요.
		
//		int pig = 8500, soju = 4500, beer = 5000;
//		int order;
//		int pay1 = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.printf("추가 주문할 삼겹살(인분)을 입력하세요 : ");
//		order = sc.nextInt();
//		
//		System.out.printf("총 결제해야할 금액: %d\n", pig*3+soju+beer+pig*order);
//		
//		pay1 = (pig*3+soju+beer+pig*order)/2; 
//		System.out.printf("더치페이로 1인당 얼마 : %d", pay1);
//		
		
		Scanner sc = new Scanner(System.in);		// 변수 선언 및 초기화
		int totalPrice, dutchPay;
		int meatPrice = 8500;
		int soju = 4500, beer = 5000;
		int addmit;
		
		System.out.println("우리 식당에서는 기본 삼겹살 3인분으로 시작합니다.");
		System.out.println("삼겹살 3인분, 소주 1병, 맥주 1병 주문되었습니다.");
		System.out.printf("삼겹살 추가 주문량을 입력하세요 : ");
		addmit = sc.nextInt();	// 입력 받기
		
		totalPrice = (meatPrice * 3) + (soju * 1) + (beer * 1);
		totalPrice += addmit * meatPrice;	// 연산하기
		dutchPay = totalPrice/2;
		
		System.out.printf("총 금액 : %,d원\n",totalPrice);		// 출력하기
		System.out.printf("1인당 결제할 금액 : %,d원\n", dutchPay);
		
		// 맨 처음에 출력할 거를 만들어놓고 위에 뭘 만들어야하는지, 뭘 선언해야하는지 생각하기.
		 
	}
}
