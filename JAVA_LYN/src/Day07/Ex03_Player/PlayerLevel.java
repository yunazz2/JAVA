package Day07.Ex03_Player;

// 추상 클래스 생성
public abstract class PlayerLevel {
	
	// 추상 메소드 생성
	// 달리기, 점프, 회전 
	public abstract void run();
	public abstract void jump();
	public abstract void turn();

	// 난이도 출력 메시지
	public abstract void showLevel();
	
	// 템플릿 메소드 (달리고, 뛰고, 돌고 하는 시나리오)
	final public void go(int count) {
		run(); // 달리기
		
		for (int i = 0; i < count; i++) {
			jump(); // 뛰기
		}
		turn(); // 돌기
	}
	
}
