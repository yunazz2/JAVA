package Day07.Ex03_Player;

public class Player {

	// 선수의 난이도
	private PlayerLevel level;
	
	// 기본 생성자
	// 기본 입문자로 시작
	public Player() {
		level = new BeginnerLevel();
		level.showLevel(); 
	}

	
	// getter만 생성 함.
	public PlayerLevel getLevel() {
		return level;
	}

	
	// 레벨 변경 기능
	public void Upgrde(PlayerLevel level) {
		this.level = level;
		level.showLevel();
	}
	
	
	// 
	public void play(int count) {
		level.go(count); // PlayerLevel 템플릿 메소드 호출
	}
	
}
