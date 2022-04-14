package Chapter22.입출력.decorator;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {		
		super.brewing();
		System.out.println("Adding Mocha Syrup");
	}

}
