package star;

public class Ex02 {
	public static void main(String[] args) {
		// 횟수를 제어할 변수를 미리 만들어두고 내가 직접 횟수를 변경/제어하기.
		
		int size = 5;
		int sp = 2;	// size / 2;
		int st = 1;	// 별의 개수
		
//		for (int i = 0; i < size; i++) {
//			// 공백
//			for(int j = 0; j < sp; j++) {
//				System.out.print("_ ");
//			}
//			// 별
//			for(int j = 0; j < st; j++) {
//				System.out.print("* ");
//			}
//			// 공백
//			for(int j = 0; j< sp; j++) {
//				System.out.print("_ ");
//			}
//			System.out.println();
//			if(i < size/2) {		// 전체 줄 중에서 가운데 도달하지 못했다면(윗부분)
//				sp -= 1;
//				st += 2;
//			}
//			else {					// 가운데 줄이거나 아랫쪽이면
//				sp += 1;
//				st -= 2;
//			}
//		}
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j >= 5-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			for(int j = 5; j >= 5-i; j--) {
				System.out.print(" ");
			}System.out.println();
		}
		// 나비넥타이
		int size1 = 5;
		int st1 = 1;
		int sp1 = size1 - (st1*2); // size / 2
		
		
		for(int i = 0; i < size1; i++) {
			for(int j = 0; j < st1; j++) {	// 0, 1, 2
				System.out.print("* ");
			}
			for(int j = 0; j < sp1; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j < st1; j++) {	// 0, 2
				System.out.print("* ");
				if(i == size/2) {			// 가운데 줄이면
					j++;					// j를 한번 더 증가(j를 2씩 증가)
				}
			}
			System.out.println();
			
			if(i < (size1/2)) {
				st1 += 1;
				sp1 -= 2;
			}
			else {
				st1 -= 1;
				sp1 += 2;
			}
		}
	}
}
