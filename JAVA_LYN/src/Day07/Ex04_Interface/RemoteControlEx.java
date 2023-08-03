// RemoteControl 인터페이스로 tv, speaker 음량 제어해보기
package Day07.Ex04_Interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new 구현클래스();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true); // Television에 보면 음소거 기능은 오버라이딩 안되어있다. => RemoteContol에서 디폴트로 구현되어있기 때문에 객체를 따로 생성 하지 않아도 사용 가능하다.
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		speakerRc.turnOn();
		speakerRc.setVolume(5);
		speakerRc.setVolume(-100);
		speakerRc.setMute(false); // Speaker에 보면 음소거 기능은 오버라이딩 안되어있다. => RemoteContol에서 디폴트로 구현되어있기 때문에 객체를 따로 생성 하지 않아도 사용 가능하다.
		speakerRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();
		
		
	}
}
