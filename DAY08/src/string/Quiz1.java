package string;

public class Quiz1 {
	public static void main(String[] args) {
		// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요.
		String str = "a1B2c3D4e5";
		String s2 = "";						// 정수 덧셈에 대한 항등원이 0이라면
		char[] arr = str.toCharArray();		// 문자열 덧셈에 대한 항등원은 ""이다. (아무것도 더하지 않았을 때의 값)
		
		
		for(int i = 0; i < arr.length; i++) {	// 전체 데이터 중에서
			char ch = arr[i];
			// char ch = s1.charAt(i);			// 각 글자를 ch라고 할 때
			if(('a'<= ch && ch <= 'z')|| ('A' <= ch && ch <= 'Z')) {	// ch가 알파벳이면
//				System.out.print(s2); 
				s2 += ch;			// ch(알파벳인 글자)를 최종결과 묶음 s2에 더한다.
			}
		}System.out.println("s2 : " + s2);
	}
}
