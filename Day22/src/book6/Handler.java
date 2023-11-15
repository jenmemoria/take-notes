package book6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 데이터 저장소(배열 -> 리스트 -> 파일 -> DB)를 직접 참조하거나, 연결할 수 있음.
// 프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스
// 다 적고 생각 : 메인함수에는 아무런 영향이 없다. (메인함수는 수정 아무것도 안 함. 완벽하게 분리)

public class Handler {

	
	// 전체 목록 출력
	public void showList() {
		BookDAO dao = new BookDAO();			// connection이 연결된 상태
		List<BookDTO> list =dao.selectList();	// DB에 저장된 데이터를 불러온다.
		list.forEach(ob -> System.out.println(ob));
	}
	
	// 도서 추가
	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();			
		row = dao.insertBook(ob);		// 메인이 넘겨준 객체를 dao로 전달하여 추가한다.
		return row;						// 추가 결과 정수를 다시 메인으로 반환한다.
	}
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 삭제한다.
	int deleteBook(String name) {	
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);
		return row;
	}
}
