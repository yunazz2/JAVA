// 추상 메소드를 정의하면, abstract 키워드를 붙여주어야 한다.
// 추상 메소드를 정의하면, 클래스도 추상 클래스로 정의해야한다.

package Day07.Ex02_Computer;

// 추상 클래스
public abstract class Computer {
	
	// 추상 메소드
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
