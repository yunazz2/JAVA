// PlayerLevel중 초급자 레벨의 달리기, 점프, 회전
package Day07.Ex03_Player;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아직 점프할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("아직 회전할 수 없습니다.");
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 입문자");
	}

}
