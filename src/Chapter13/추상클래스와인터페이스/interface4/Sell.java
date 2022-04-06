package Chapter13.추상클래스와인터페이스.interface4;

public interface Sell {

	void sell();
	default void order() {
		System.out.println("판매 주문");
		
		
	}
}
