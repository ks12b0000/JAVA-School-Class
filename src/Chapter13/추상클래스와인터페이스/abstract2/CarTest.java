package Chapter13.추상클래스와인터페이스.abstract2;

public class CarTest {

	public static void main(String[] args) {
		Car manualcar = new ManualCar();
		manualcar.run();
		
		System.out.println();
		
		Car selfdrivingcar = new SelfDrivingCar();
		selfdrivingcar.run();

	}

}
