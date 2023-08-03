package Day07.Ex03_Player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");		
	}

	@Override
	public void turn() {
		System.out.println("아직 회전할 수 없습니다.");		
	}

	@Override
	public void showLevel() {
		System.out.println("레벨 : 중급자");
	}

}
