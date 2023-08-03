package Day07.Ex02_Computer;

// 추상 클래스의 추상 메소드를 구현하지 않으면, 해당 클래스를 추상 클래스로 정의해야한다.
public abstract class Laptop extends Computer {

	@Override
	public void display() {
		System.out.println("Laptop - display");
	}
	
	

}
