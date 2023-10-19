package loop;

import java.text.DecimalFormat;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다.
		// 첫 날에 10원, 그 다음날에 20원, 다음날에 40원
		// 이런 식으로 전 날의 두배를 준비하여 입금한다.
		// 30일 째 입금이 끝난 후
		// 31일 째 은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요.
		// (금액에 천 단위 구분 기호 콤마를 적용하여 출력하세요.)
		
		long cash = 10, sum = 10;
		int date = 1;
		
		System.out.printf("%d일 째 누적된 총 금액은 : %,d원 입니다.\n", date, cash);
		
		while (date <= 29) {
			cash *= 2;
			sum += cash;
			date += 1;
			System.out.printf("%d일 째 누적된 총 금액은 : %,d원 입니다.\n", date, sum);
		}
	}
}
