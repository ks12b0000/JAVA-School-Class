package Chapter13.추상클래스와인터페이스.interface4;

public interface Buy {

	void buy();
	default void order() {
		System.out.println("구매 주문");
	}
}
