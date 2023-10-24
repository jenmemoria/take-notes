package string;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		1) 16자리의 카드번호를 문자열로 입력받아서
		2) 카드 번호의 오른쪽 끝에서부터 세어서
		3) 홀수번째는 그대로 두고 짝수번째는 2를 곱한다. 
		4) 	만약 2를 곱한 숫자가 두자리수이면
			각 자리수를 더해서 한 자리 수로 만든다.
		5) 	이렇게 만들어진 16개의 한 자리숫자를 모두 더하여
	 		그 합이 10으로 나누어 떨어지면 유효한 카드번호
			그렇지 않으면 유효하지 않은 카드번호이다.
		(Luhn 알고리즘)
			  
		카드번호를 입력받아서 유효성을 검증하는 코드를 작성하세요.
		(String, char, int, /, %, +)
		*/			
		String input = "1162-3434-1010-2111";
			input = input.replace("-", "");
			char arr[] = input.toCharArray();
			int sum = 0;
			
			for(int i = 15; i >= 0; i--) {
				char ch = arr[i];
				int num = Character.getNumericValue(ch);	// int num = ch - 48; or int num = Integer.parseInt(s1.substring(i, i+1));
//				System.out.println(ch);
				if (i % 2 != 0) {
					sum += num;
				}
				else {
					num *= 2;
					sum += (num % 10) + (num / 10);

				}
			}
			System.out.println(sum);
			if (sum % 10 == 0) {
				System.out.println("유효한 카드 번호입니다.");
			}
			else {
				System.out.println("카드가 유효하지 않습니다.");
			}
			

//			for(int i = 1; i<=reversedinput.length(); i++) {
//				char ch = reversedinput.charAt(i);
//				if(i % 2 !=0) {
//					s2 += ch;
//					System.out.println(s2);
				}
//				else if (i % 2 == 0){
//					ch *= 2;
//					sum += ch % 10;
//					sum += ch / 10;
//					s2 += ch;
//				}
//				System.out.println(s2);
		
			//System.out.println(s2);
			
//			for(int i = arr[-1]; i >= arr[0]; i--) {
//				if(i % 2 != 0) {
//					System.out.println(i);
//				}
//			}
	}