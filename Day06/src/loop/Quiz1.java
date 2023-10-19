package loop;

public class Quiz1 {
	public static void main(String[] args) {
		// 1) 자신의 이름을 5회 반복하여 출력하세요.
		int n1 = 0;
		while (n1 < 5) {
			++n1;
			System.out.println("왕제은");
		}
		
		// 2) 0부터 5까지 한 줄에 출력하세요.
		n1 = 0;
		while (n1 < 6) {
			System.out.print(n1 + " ");
			++n1;
		}
		System.out.println();
		
		// 3) 5부터 0까지 한 줄에 출력하세요.
		n1 = 5;
		while (n1 >=0) {
			System.out.print(n1 + " ");
			--n1;
		}
		System.out.println();
		
		// 4) 1부터 100까지의 합계를 구하여 출력하세요.
		n1 = 1; 
		int sum = 0;
		while (n1 <= 100) {
			sum += n1;
			n1++;
		}
		System.out.println(sum);
		
		// 5) 1부터 100사이의 정수 중, 7의 배수만 한 줄에 출력하세요.
		n1 = 1; 
		while (n1 <= 100) {
			++n1;
			if(n1 % 7 == 0) {
				System.out.print(n1 + " ");
			}
		}
	}
}
