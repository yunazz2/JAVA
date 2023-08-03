// 앞서 만든 Player, PlayerLevel, Bdgginer~, Advanced~, Super 를 합쳐 실행하는 클래스
package Day07.Ex03_Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		System.out.println("------------------------");
		
		AdvancedLevel level1 = new AdvancedLevel();
		player.Upgrde(level1);
		player.play(2);
		System.out.println("------------------------");
		
		SuperLevel level2 = new SuperLevel();
		player.Upgrde(level2);
		player.play(3);
		System.out.println("------------------------");
	}
}
