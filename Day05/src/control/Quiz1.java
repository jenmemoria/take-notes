package control;

import java.util.Random;

public class Quiz1 {
	public static void main(String[] args) {
		// 게시글 데이터의 총 개수가 주어지면
		// 여러 게시글을 총 몇 개의 페이지로 나누어서 불러와야 할 지 계산하여 출력하세요.
		// - 페이지 당 게시글 출력 개수는 10개이다.
		// - 하나의 게시글이라도 생략되면 안 된다.
		// - 총 게시글 수는 10000 ~ 99999 사이이다.
		// - 요청으로 읽어들여야 할 게시글의 페이지 번호가 제시된다.
		// - 출력으로 불러와야 할 게시글의 번호를 n번부터 n + 10까지 가져와야 한다.
		
		Random ran = new Random();		
		int boardCount = ran.nextInt(89999) + 10000;
		int pageCount = 1 ;	// 수정되어야 함. 선생님 코드 : boardCount / 10;
//		if(boardCount % 10 != 0) {
//			boardCount += 1;
//		}
		int page = ran.nextInt(pageCount) + 1;
		int begin = 0, end = 0;
		
//		begin = page * 10 - 9;		page를 이용하여 begin을 구하는 식
//		end = begin + 9;
		
		
		// 총 게시글 개수 4096
		// 총페이지 개수 410
		// 요청받은 페이지수 	1	2	3	4	...	409		410
		// 시작값				1	11	21	31	...	4081	4091
		// 끝값				10	20	30	40		4090	4096
		
		if (boardCount % 10 != 0) {
			pageCount = boardCount / 10 + 1;
			page = ran.nextInt(pageCount) + 1;
			begin = page * 10 - 9;
			end = page * 10;
		}
		else {
			pageCount = boardCount / 10;
			page = ran.nextInt(pageCount) + 1;
			begin = page * 10 - 9;
			end = page * 10;
		}
		System.out.println("총 페이지의 개수 : " + boardCount);
		System.out.println("요청받은 페이지 : " + page);
		System.out.printf("%d개의 게시글에서 %d페이지를 요청받았으므로, \n", boardCount, page);
		System.out.printf("%d번부터 %d번 게시글을 불러와서 출력하면 된다.\n", begin, end);
	}
}
