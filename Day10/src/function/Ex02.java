package function;

public class Ex02 {
	
	static int add(int n1, int n2) {
		int answer = n1 + n2;
		return answer;
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int min;
		if (n1 > n3 && n2 > n3) min = n3;
		else if (n2 > n1 && n3 > n1) min = n1;
		else min = n2;
		
		return min;
	}
	
	static String upperCase(String s1) {
//		내가 푼 거		
//		String s2 = "";
//		char ch = s1.charAt(0);
//		if('0' <= ch && ch <= '9') {
//			s2 += s1;
//		}
//		else {
//			s2 += s1.substring(0,1).toUpperCase() + s1.substring(1);
//		}
//		return s2;
		// 선생님 답안.
		String answer = "";
		for(int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if(i == 0 && 'a' <= ch && ch <= 'z') {
				ch -= 32;		// 첫 글자가 소문자이면 대문자로 바꿔라.
			}
			answer += ch;		// 1번째 글자(ch)를 answer에 순서대로 더한다.
		}return answer;
	}
	
	static String substring(String s1, int n1, int n2) {
		String s2 = "";
		
		for(int i = n1; i < n2; i++) {
			s2 += s1.charAt(i);
		}return s2;
	}
	public static void main(String[] args) {
		
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요.
		int q1 = add(1,2);
		System.out.println(q1);
		
		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수를 getMinNumber를 작성하세요.
		int q2 = getMinNumber(15, 23, 9);
		System.out.println(q2);
		
		// 3) 문자를 하나를 전달받아서, 첫 글자를 대문자로 변환하는 함수 upperCase를 작성하세요.
		String q3 = upperCase("hello");
		System.out.println("q3 : " + q3);
		
		String t3 = upperCase("3 years later");
		System.out.println("t3 : " + t3);
		
		// 4) 문자열 하나와 정수 두개를 전달받아서
		// 문자열 from번째 글자부터 to 글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요.
		String q4 = substring("Hello, world !!", 0, 5);
		System.out.println("q4 : " + q4);
		
		String t4 = substring("Hello, world !!", 7, 12);
		System.out.println("t4 : " + t4);
	}
}
