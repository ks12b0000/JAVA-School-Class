package Chapter8.클래스와객체3.collabration;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	//승차하다
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void busInfo() {
		System.out.println(busNumber +"번 버스의 승객은 "+ passengerCount +"명이고, 수입은"+
							money + "원 입니다.");
	}
}
