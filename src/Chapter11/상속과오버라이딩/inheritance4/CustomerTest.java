package Chapter11.상속과오버라이딩.inheritance4;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(202204);
		customerLee.bonusPoint = 1000; 
		System.out.println(customerLee.showCustomerInfo());
		
	
		System.out.println();
		
		VIPCustomer customerJung = new VIPCustomer();
		customerJung.setCustomerName("정도전");
		customerJung.setCustomerID(202206);
		customerJung.bonusPoint = 10000;
		System.out.println(customerJung.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerShin = new VIPCustomer();
		customerShin.setCustomerName("신사임당");
		customerShin.setCustomerID(202205);
		customerShin.bonusPoint = 10000;
		System.out.println(customerShin.showCustomerInfo());
	
	}

}
