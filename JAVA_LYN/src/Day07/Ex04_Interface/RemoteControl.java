/**
 *  인터페이스는 객체를 생성할 수 없으나, static으로 정의하여 사용할 수는 있다.(ex ln33)
 *	인터페이스는 추상 메소드만 사용할 수 있으나(= 중괄호로 된 메소드 사용 못함), default와 static 메소드는 사용할 수 있도록 허용한다.
 */

package Day07.Ex04_Interface;

public interface RemoteControl {
	
	// 상수
	// 인터페이스 변수는 public static final로 자동으로 선언된다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//인터페이스 안에서의 추상 메소드 : (public abstract)를 생략하고 작성할 수 있다.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 : 구현한 객체가 기본으로 사용할 수 있는 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 설정");
			setVolume(0);
		}
		else {
			System.out.println("음소거 해제");
			setVolume(5);
		}
	}
	
	// static 메소드(정적 메소드) : 구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드
	static void changeBattery() {
		System.out.println("배터리를 교환");
	}
	
}
