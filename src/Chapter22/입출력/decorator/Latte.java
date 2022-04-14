package Chapter22.입출력.decorator;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
		
	}

}
