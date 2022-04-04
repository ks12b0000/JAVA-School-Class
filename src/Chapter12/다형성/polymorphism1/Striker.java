package Chapter12.다형성.polymorphism1;

public class Striker extends Player {

	private int shoot;
	
	public Striker(String name, int age, int backNumber, int speed,int shoot) {
		super(name,age,backNumber,speed);
		this.shoot = shoot;
	
	}

	public int getshoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("유효 수팅 : "+ this.getshoot());
	}

}
