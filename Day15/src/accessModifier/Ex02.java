package accessModifier;

class Message{
	
	private String name;
	// 같은 클래스를 사용하는 서로 다른 객체라면
	// private이더라도 필드 값에 직접 접근할 수 있다.
	
	public Message(String name) {
		this.name = name;
	}
	void sendMessage(Message other, String message) {
		other.receieveMessage(this, message);		// 여기서 this는 ob1이 된다, this는 보낸사람이 됨, 자기자신.
	}
	
	void receieveMessage(Message sender, String message) {
		// 받는 사람의 receieveMessage를 호출한다.
		// 이 때 전달하는 this는 sendMessage를 호출했던 자기자신이다.
		// 따라서 this의 자료형은 Message이다.
		// 보내기만 하면 안 되니까 자동으로 받을 수 있게.
		System.out.printf("=== %s의 화면 ===\n", this.name);
		System.out.printf("%s : %s\n", sender.name, message);	// name을 안 붙여주면 고유 번호로 나옴.
		// 클래스 변수의 자료형이 같으면 private라도 접근이 가능하다. (무시하는 건 아니고)
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Message ob1 = new Message("짱구");
		Message ob2 = new Message("유리");
		
		ob1.sendMessage(ob2, "유리야 안녕");
		ob2.sendMessage(ob1, "안녕 짱구야, 소꿉놀이 하러 갈래 ?");
	}
}
