package string;

public class Ex03 {
	public static void main(String[] args) {
		// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요.
		String s1 = "a1B2c3D4e5";
		String filter = "abcdefgABCDEFG";
		String s2 = "";						// 정수 덧셈에 대한 항등원이 0이라면
			
		for(int i = 0; i < s1.length(); i++) {	// 전체 데이터 중에서
			char ch = s1.charAt(i);			// 각 글자를 ch라고 할 때
			String s = ch + "";
			if(filter.contains(s)) {
				s2 += s;
			}
		}System.out.println("s2 : " + s2);
	}
}
