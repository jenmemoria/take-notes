package loop;

import java.io.File;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		File f = new File("src/loop/Ex02.java");
		System.out.println(f.exists());		// 지정한 파일이 실제로 존재하는가 ?
		
		Scanner sc = new Scanner(f);
		// 코드를 작성하는 시점에서 대상 파일의 정확한 줄 수를 알기 어려울 수도 있다.
		// 반복을 수행할 때마다, 다음줄이 있는지 확인해보고
		// 다음 줄이 있으면 내용을 가져와서 출력
		// while은 반복되는 if문, 길이가 가변적으로 변하지 않으면 while문, 변하면 for문.
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
	}
}
