package star;

public class Ex01 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			int num = 5-i;
			System.out.printf("%d, %d\n", i , num);
		}
		for(int i = 1; i <= 5; i++) {		// 한 줄의 내용을 출력한다.
			int num = 5 - i;
			
			for(int j = 0; j < num; j++) {	// 5, 4, 3, 2, 1	한 줄 안에서 먼저 나오는 글자의 개수
				System.out.print("_");
			}
			for(int j = 0; j < i; j++) {	// 0, 1, 2, 3, 4	한 줄 안에서 나중에 나오는 글자의 개수
				System.out.print("*");
			}System.out.printf("\t%d, %d", num, i);
			System.out.println();
		}
	}
}
