// 익명 <<구현>> 객체
package Day08.Ex04_AnonymousObject;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 익명 구현 객체 : 클래스를 정의하지 않고도, 이름 없이 구현한 객체
		// 인터페이스 객체명 = new 인터페이스(인자1, ...) {객체 정의}
		
		RemoteControl rc = new RemoteControl() {
			
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("OFF");
				
			}
			
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("volume : " + this.volume);
				
			}
		};
		
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();
	}
}
