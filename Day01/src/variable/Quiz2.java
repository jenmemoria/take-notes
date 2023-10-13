package variable;

public class Quiz2 {
	public static void main(String[] args) {
		// 자신의 이름을 문자열 변수에 저장하세요.
		String name = "왕제은";
		
		// 자신의 나이를 정수형 변수에 저장하세요.
		int age = 24;
		Integer age2 = 24;
		
		// 새로운 실수형 변수에 0을 대입하세요.
		double n1 = 0;				// 우변의 0은 자료형이 명시되지 않은 리터럴이지만, 리터럴 정수의 기본자료형은 int형이다.
		Double n2 = (double)0;		// Type mismatch : cannot convert from int to Double.
//		Double db2 = 0.0;
		Double db2 = Double.valueOf(0);
		
		// 방금 만든 실수형 변수에 3.14을 대입하세요.
		n1 = 3.14;
		n2 = 3.14;
		
		// 지금까지 만든 3개 변수에 담긴 값을 각각 한 줄씩 화면에 출력하세요.
		System.out.println(name);
		System.out.println(age);
		System.out.println(n1);
		System.out.println();
		
		System.out.println(name);
		System.out.println(age2);
		System.out.println(n2);
	}
}
