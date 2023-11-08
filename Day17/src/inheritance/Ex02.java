package inheritance;

class Parent2{
	// 상속에서의 생성자
	int n1, n2;
	
	Parent2(int n1, int n2){			// 비어져 있어도 실행은 잘 된다.
		this.n1 = n1;
		this.n2 = n2;
	} // 내가 생성자를 안 만들면 기본으로 만들어짐.
	void show() {
		System.out.printf("%d, %d\n", n1, n2);
	}
}

class Child2 extends Parent2{
	// 1) 서브 클래스의 생성자는 반드시 슈퍼클래스의 생성자를 호출해야만 한다.
	// 2) 서브 클래스의 생성자는 매개변수 형태가 같은 슈퍼 클래스의 생성자를 호출하지 않아도 된다.
	int n3;
	
	Child2(int n1, int n2, int n3){	// 이미 존재하는 슈퍼 클래스의 생성자를 호출하면 된다(첫줄에 무조건 호출)
		super(n1, n2);	// 슈퍼 클래스의 생성자를 호출하기 위한 코드, 슈퍼한테 n1과 n2를 전달하면 된다, 무조건 한 번은 호출해야한다.
		this.n3 = n3;
	}
	Child2(){
		super(10,20);	// 2번 경우
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Child2 ob1 = new Child2();
		ob1.show();
	}
}
