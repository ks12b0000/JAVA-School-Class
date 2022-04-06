package Chapter13.추상클래스와인터페이스.interface4;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		System.out.println();
		
		Buy buy = new Customer();
		buy.buy();
		buy.order();
		
		System.out.println();
		
		Sell sell = new Customer();
		sell.sell();
		sell.order();

	}

}
