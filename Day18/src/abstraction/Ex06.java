package abstraction;
// 인터페이스 : 자바 클래스 문법에서 예외 덩어리

interface Test6{
	// 인터페이스는 추상클래스의 일종이다.
	// 인터페이스는 일반적인 추상클래스와 달리일반 메서드를 포함할 수 없다.
	// 인터페이스는 extends 대신 implements 키워드로 상속(구현)한다.
	// 인터페이스의 모든 필드는 public static final 속성을 가진다.
	// 인터페이스의 모든 메서드는 public abstract 속성을 가진다.
	// 인터페이스는 다중 상속을 허용한다.
	// 형식만 맞춰주고 내부 수행은 달라 ex) 선풍기 usb, 이동식 usb
	
	String name = "테스트 인터페이스";
	
	// Abstract methods do not specify a body
	// 추상 메서드는 body를 지정할 수 없습니다.
	
	void f1();	// 눈물을 머금고 세미클론으로 마무리 ㅠㅠ;
	
	// Illegal modifier for the interface method f2; 
	// only public, private, abstract, default, static and strictfp are permitted
	// 잘못된 식별자가 f2에 지정되었습니다.
	// 오로지 public, private, abstract, default, static 그리고 strictfp만 허용됩니다.
//	protected void f2();
	
	private void f2() {
		// 내부에서만 호출가능한 함수
	}
	
	public abstract void f3();	// 메서드만 작성했을 때의 기본형
}
public class Ex06 {
	public static void main(String[] args) {
		// 
	}
}
