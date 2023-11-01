package accessModifier;

public class Ex02 {
	public static void main(String[] args) {
		
		Human ob1 = new Human();
//		ob1.name = "이지은";
		ob1.setName("이지은");
		
//		ob1.age = 30;
		ob1.setAge(30);
		
//		System.out.println("이름 : " + ob1.name);
		System.out.println("이름 : " + ob1.getName());
		
//		System.out.println("나이 : " + ob1.age);
		System.out.println("나이 : " + ob1.getAge());
		
		// getter와 setter가 있으면 어차피 필드에 모두 접근이 가능한데 : 내부 필드의 접근을 개발자가 원하는 대로 접근할 수 있도록 하는 것.
		// 안 써도 효과가 같지 않나요 ?
		// ex) 자판기 예시 생각해보기.
		
	}
}
