package Chapter8.클래스와객체3.singleton2;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car Mycar = factory.createCar();
		Car yourcar = factory.createCar();
		
		System.out.println(Mycar.getCarNum());
		System.out.println(yourcar.getCarNum());
	}

}
