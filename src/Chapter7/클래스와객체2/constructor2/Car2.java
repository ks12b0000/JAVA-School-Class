package Chapter7.클래스와객체2.constructor2;

public class Car2 {
	
	String color;       //색상
	String gearType;    //변속기 종류
	int door;           // 차문
	
	public Car2() {
		//같은 클래스내에 있는 매개변수가 3개인 생성자를 호출
		this("검정", "수동", 5);
	}
	
	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public Car2(Car2 car) {
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
