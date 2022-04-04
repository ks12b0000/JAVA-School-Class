package Chapter12.다형성.polymorphism2;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = null;
		SportCar sportCar = new SportCar();
		PoliceCar poleceCar = new PoliceCar();
		
		sportCar.speedUp();
		
		
		car = sportCar;			//업캐스팅 (자손 -> 조상)
		
		SportCar sportCar2 = null;
		sportCar2 = (SportCar)car;    //다운 캐스팅(조상 -> 자손)		
										// 조작할수 있는 멤버가 늘어남.
		
		sportCar2.speedUp();
		
		//sportCar = policeCar;     //서로 관련없는 클래스들간의 형변환이 이루어질수 없다.

	}

}
