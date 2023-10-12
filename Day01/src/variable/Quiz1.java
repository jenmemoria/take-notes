package variable;

public class Quiz1 {
	public static void main(String[] args) {
		
		// 위 두 변수에 저장된 값을 활요하여 키와 체중을 소수점 아래자리 없이 정수형태로 출력
		// (자료형 변환을 활용하여 새로운 변수에 저장하고 값을 출력)
		
		double height = 172.8;
		double weight = 67.4;
		
		System.out.println((int)172.8);
		System.out.println((int)67.4);
		
		int height2 = (int)height;
		int weight2 = (int)weight;
		
		System.out.println(height2);
		System.out.println(weight2);
		
		// 선생님의 의도 : 실수는 소수점까지 표현되지만, 정수는 소수점을 표현하지 않는다.
		// 실수 값을 정수형 변수에 옮겨담으면 소수점은 잘린다. (의도된 데이터 손실)
		// Doctor tmp = (Doctor)client04;
	}
}
