package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) throws Exception {
		String data = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		int cnt = 0;
		
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		sc.close();
		
		System.out.println(data);
		
		// Q1. data 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇 개일까요 ?
		for(int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				cnt += 1;
			}
		}System.out.println("대문자의 개수 : " + cnt);
		System.out.println();
		
		// 위와 비슷한 구조의 숫자 문제
		// 1에서 1000 사이의 정수 중에서 13과 17의 공배수는 총 몇개인지 출력하세요
		cnt = 0;
		for(int i = 1; i < 1001; i++) {
			if (i % 221 == 0) {
				System.out.println(i);
				cnt += 1;
			}
		}System.out.println("공배수 몇 개 : " + cnt);
		
	}
}
