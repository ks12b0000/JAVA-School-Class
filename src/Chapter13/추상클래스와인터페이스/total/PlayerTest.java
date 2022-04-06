package Chapter13.추상클래스와인터페이스.total;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvanceLevel aLevel = new AdvanceLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
