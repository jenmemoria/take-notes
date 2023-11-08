package inheritance;

class Parent4{
	double db = 1.2;
	
	void show() {	// 접근제한자가 아무것도 설정이 안 되어 있으면 패키지이다.
		System.out.printf("Parent) db : %f\n", db);
	}
}

class Child4 extends Parent4{
	// 슈퍼클래스에서 이미 만들어진 기능이 있지만
	// 기능의 내용을 수정해서 사용하고 싶을 때 (없는 기능을 추가하는 상황이 아님.)
	// 기존 기능(함수)의 형식은 그대로 정의하고, 내용만 새로 작성하여 사용할 수 있다.
	// 기존에 정의된 함수를 새롭게 재정의한다 라고 하여 override라고 한다.
	// ** 메서드 오버라이딩은 오버로딩과 달리 반환형, 함수이름, 매개변수의 형태 및 개수가 모두 일치해야 한다. (완전히 겹쳐져야함.)
	
	// Cannot reduce the visibility of the inherited method from Parent4
	// 상속받은 메서드의 접근제한자 범위를 줄일 수 없습니다. (늘리는 건 가능)
	// private -> package -> protected -> public	(접근 제한자 범위가 작은 순) 
	
	@Override	// 오버라이딩 규칙에 맞지 않으면 경고를 보내고, 실행시키지 않는다.
	void show() {	// 매개변수 안에 부모클래스와 다르게 추가하면 오버라이딩으로 인정하지 않는다.
					// 이 메서드는 상속받은 후 재정의한 메서드입니다 !! => 라고 다른 개발자에게 알려주는 용도로도 쓰인다.
		System.out.printf("Child) db : %.2f\n", db);
	}
					// final 클래스는 상속받을 수 없다. (예 : Scanner)
//	@Override		// final 메서드는 오버라이딩 할 수 없다. (함수 내용을 바꿀 수 없다.)
//	void test() {	// final 필드는 값을 바꿀 수 없다.
//		
//		System.out.println("오버라이딩 돼!!");
//
//	}
	 
}
public class Ex04 {
	public static void main(String[] args) {
		Parent4 ob1 = new Parent4();
		ob1.show();
		
		Child4 ob2 = new Child4();
		ob2.show();
	}
}
