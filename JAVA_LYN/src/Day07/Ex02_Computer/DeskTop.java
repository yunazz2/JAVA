package Day07.Ex02_Computer;

// 부모 클래스인 Computer가 추상 클래스이기 때문에 해당 클래스를 상속 받는 추상 메소드는 반드시 오버라이딩 해야한다.
public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop - display");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop - typing");
		
	}
	

}
