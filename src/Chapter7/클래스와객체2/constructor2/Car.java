package Chapter7.클래스와객체2.constructor2;

public class Car {
	
	String color;       //색상
	String gearType;    //변속기 종류
	int door;           // 차문
	
	public Car() {
		this.color = "노랑";
		this.gearType = "수동";
		this.door = 4;
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	//인스턴스 복제를 위한 생성자
	public Car(Car car) {
		this.color = car.color;
		this.gearType = car.gearType;
		this.door = car.door;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color +", "+
				this.gearType+", "+
				this.door;
	}
	
	
	

}
