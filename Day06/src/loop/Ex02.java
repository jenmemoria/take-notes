package loop;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		// Hello를 5줄 출력하기
		int i = 0;
		while (i < 5) {
//			++num;
//			System.out.println("Hello 몇 번째 ? : "+num);
			System.out.println("Hello");
			i++;
		}
		System.out.println();
		
		// 값이 면하는 숫자 출력하기
		i = 0;			// 시작값
		while(i < 5) {	// 범위 (끝값, 마지막 값은 포함하지 않는다.)
			System.out.println(i);
			i++;		// 증감식, i+=1;
		}
		System.out.println();
		
		char ch = 'A';			// 반복문은 일정한 조건(일정한 규칙)에 의해 반복한다.
		while (ch <= 'Z') {
			System.out.println(ch + " (" + (int)ch + ")");
			ch++;
		}
		System.out.println();
		
		// 놀이기구 문제의 요금표를 반복문으로 간단하게 표현하기
		// 반복되는 현상의 규칙을 파악한다면 훨씬 수월하게 작업
		int st = 31;
		int fee = 3500;
		System.out.println("0 ~ 30분 : 3,000원");
		
		while(st <= 180) {	// 무한반복이 아니라면, 원하는 범위를 설정한다.
			System.out.printf("%d ~ %d분 : %,d원\n", st, st + 9, fee);
			st += 10;		// 1구간당 10분단위로 표현한다.
			fee += 500;		// 1구간당 500원 단위로 표현한다.
		}
		System.out.println();
		
		// 오전 취업반의 수업 시간은 9시, 10시, 11시, 12:30, 13:30, 14:30 이다.
		// while을 이용하여 출력해보자.
		
//		int hour = 9, minute = 0;
//		
//		while (true) {	// 조건이 항상 참인 반복문, 무한반복 (일단 반복을 돌린다.)
//			System.out.printf("%02d : %02d ~ ", hour, minute);
//			minute += 50;
//			hour += minute / 60;
//			minute %= 60;
//			
//			System.out.printf("%02d : %02d\n", hour, minute);
//			hour++;
//			
//			if(hour == 12) {
//				minute += 30;
//			}
//			if(hour == 15 && minute == 20) {	// 특정 조건에 의해
//				break;		// 반복문을 종료한다.
//			}
//			minute += 10;
//			if(minute == 60) {
//				minute = 0;
//			}
			int n1 = 9, n2 = 0, n3 = 9, n4 = 50;
			
			while(n1 < 16) {		// 조건이 항상 참인 반복문, 무한반복 (일단 반복을 돌린다.)
				System.out.printf("%02d:%02d ~ %02d:%02d\n", n1, n2, n3, n4);
				n1 += 1;			// n1을 증가 (1시간이 지나간다.)
				n3 = n1;			// 오전에는 시작시간과 종료시간의 hour가 같다.
				
				if(n1 >= 12) {		// 오후가 되면
					n3 += 1;		// 시작시간보다 종료시간의 hour가 1만큼 더 크다.
					n2 = 30;		// 시작시간의 분은 30분 고정.
					n4 = 20;		// 종료시간의 분은 20분 고정.
				}
		}
	}
}
