package Chapter13.추상클래스와인터페이스.interface4;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("Customer sell");
		
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
		
	}

	@Override
	public void order() {
		System.out.println("Hello Ezen!");
	}

}
