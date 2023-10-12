package variable;

public class Quiz1 {
	public static void main(String[] args) {
		
		double height = 172.8;
		double weight = 67.4;
		
		System.out.println((int)height);
		System.out.println((int)67.4);
		
		int height2 = (int)height;
		int weight2 = (int)weight;
		
		System.out.println(height2);
		System.out.println(weight2);
		
		// 위 두 변수에 저장된 값을 활요하여 키와 체중을 소수점 아래자리 없이 정수형태로 출력
		// (자료형 변환을 활용하여 새로운 변수에 저장하고 값을 출력)
	}
}
