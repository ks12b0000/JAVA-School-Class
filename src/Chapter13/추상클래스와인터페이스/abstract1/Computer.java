package Chapter13.추상클래스와인터페이스.abstract1;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다");
	

}
	public void turnOff() {
		System.out.println("전원을끕니다");
	}
}
