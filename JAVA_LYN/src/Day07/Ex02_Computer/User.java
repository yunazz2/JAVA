// Computer 구현
package Day07.Ex02_Computer;

public class User {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
//		Computer computer2 = new Laptop(); // => 추상 클래스는 객체로 생성할 수 없다.
		
		Computer computer2 = new Gram();
		Laptop laptop = new Gram();
		Gram gram = new Gram();
		
		computer.turnOn();
		computer.display();
		computer.typing();
		computer.turnOff();
		System.out.println();
		
		computer2.turnOn();
		computer2.display();
		computer2.typing();
		computer2.turnOff();
		System.out.println();
		
		laptop.turnOn();
		laptop.display();
		laptop.typing();
		laptop.turnOff();
		System.out.println();
		
		gram.turnOn();
		gram.display();
		gram.typing();
		gram.turnOff();
		System.out.println();
		
	}
}
