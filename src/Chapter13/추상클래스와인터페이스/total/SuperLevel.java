package Chapter13.추상클래스와인터페이스.total;

public class SuperLevel extends PlayerLevel {

	@Override
	public void jump() {
		System.out.println("아주 높이 jump 합니다");
	}

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다");

	}

	@Override
	public void turn() {
		System.out.println("turn 합니다");

	}

	@Override
	public void showLevelMessage() {
		System.out.println(" ******************고급자자 레벨*******************");

	}

}
