package Chapter6.클래스와객체.member2;

public class Monitor {
	//멤버변수(필드)
	String color;             //모니터의 색상
	int channel;              //채널
	int volume;               //볼륨
	boolean power;            //전원(on/off)
	
    //멤버 메서드
	public void power() {
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power;
		}else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;
		}
	}
	
	//채널업 (channelUp())
	public void channelUp() {
//		this.channel++;
		System.out.println("현재 채널 : "+(++this.channel));
	}
	
	//채널다운 (channelDown())
	public void channelDown() {
		//this.channel--;
		//System.out.println("현재 채널 : "+this.channel);
		System.out.println("현재 채널 : "+(--this.channel));
	}
	//볼륨업
	public void volumeUp() {
		System.out.println("현재 볼륨 : "+(++this.volume));
	}
	//볼륨다운
	public void volumeDown() {
		System.out.println("현재 볼륨 : "+(--this.volume));
	}
	
	
	

}


