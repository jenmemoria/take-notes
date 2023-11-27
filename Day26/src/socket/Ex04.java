package socket;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://mgr.kgitbank.com");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String content = "";
		
		while(sc.hasNextLine()) {
			content += sc.nextLine() + "\r\n";
		}
		sc.close();
		conn.disconnect();
		
		// 연결 다 끊은 다음에 출력해랏.
		
		System.out.println(conn.getResponseMessage());
		System.out.println(content);
		
	}
}
