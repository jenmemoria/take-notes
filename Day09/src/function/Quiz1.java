package function;


public class Quiz1 {
	static String getSign(int a) {
		String str;
		if(a > 0)		str = "양수";
		else if(a < 0)	str = "음수";
		else			str = "0";
		return str;
	}
	
	static int getReverseNum(int n2) {		// 나눗셈을 활용한 자릿수 구분
		int result = 0;	
		while(n2 != 0) {
			int n22 = 0;						// num		result	|	num		result
												// 1234		0		|	123		4
//			n22 = n22 * 10 + n2 % 10;			// 1234		0		|	123		40
//			n2 /= 10;							// 1234		4		|	123		43
			result += n2 % 10;					// 123		4		|	12		4
			n2 /= 10;
		}
//		return n22;
		return result;
	}
	static int pow(int n1, int n2) {
		int answer = 1;
		for(int i = 0; i < n2; i++) {
			answer *= n1;
		}
		return answer;
	}
	
	static int remainder(int n1, int n2) {
		int answer = 0;
		answer = n1 % n2;
		return answer;
	}
	
	static String getReverseStr(String a) {
		String reverse = "";
		for(int i = a.length()-1; i>=0; i--) {
			reverse += a.charAt(i);
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
		int n1 = 3;
		String s = getSign(n1);
		System.out.println(s);
		
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int n2 = 321;
		int numr = getReverseNum(n2);
		System.out.println(numr);
		
		// 3) 두 정수를 전달받아서 n1의 n2 제곱수를 반환하는 함수 pow
		int q3 = pow(2, 10);		// 1024
		System.out.println("q3 : " + q3);
		
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을 때의 나머지를 반환하는 함수 remainder
		
		int q4 = remainder(10, 6);
		System.out.println("q4 : " + q4);
		
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		
		String q5 = getReverseStr("abcd");
		System.out.println("q5 : " + q5);
		
		// 함수 호출 코드에 마우스를 올려보세요.
		// 함수 호출 코드에 마우스를 올린 상태로 컨트롤 클릭하면 함수의 정의로 이동합니다.
		int test = Integer.parseInt("1234");
	}
}
