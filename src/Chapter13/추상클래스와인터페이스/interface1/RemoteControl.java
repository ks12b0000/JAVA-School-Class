package Chapter13.추상클래스와인터페이스.interface1;

public interface RemoteControl {
	//상수(public static final)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메서드 (abstract)
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
