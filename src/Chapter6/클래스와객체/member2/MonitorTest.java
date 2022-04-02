package Chapter6.클래스와객체.member2;

public class MonitorTest {

	public static void main(String[] args) {
		//monitor 참조변수는  리모컨과 같은 것임.
		Monitor monitor = new Monitor();
		//System.out.println(monitor);
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channel = 5;
		monitor.channelUp();
		monitor.channelUp();
		monitor.channelDown();
		monitor.channelDown();
		
		monitor.power();
		
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeUp();
		monitor.volumeDown();
	}

}
