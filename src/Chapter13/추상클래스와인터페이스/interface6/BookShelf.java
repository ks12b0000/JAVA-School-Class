package Chapter13.추상클래스와인터페이스.interface6;


public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
	
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		
		return getCount();
	}

}