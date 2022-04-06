package Chapter13.추상클래스와인터페이스.total;

public class BegginerLevel extends PlayerLevel {

	@Override
	public void jump() {
		System.out.println("jump 못합니다");

	}

	@Override
	public void run() {
		System.out.println("천천히 달립니다");

	}

	@Override
	public void turn() {
		System.out.println("turn 못합니다");

	}

	@Override
	public void showLevelMessage() {
		System.out.println(" ******************초보자 레벨*******************");

	}

}
