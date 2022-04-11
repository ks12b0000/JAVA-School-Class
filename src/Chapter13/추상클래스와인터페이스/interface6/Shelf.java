package Chapter13.추상클래스와인터페이스.interface6;

import java.util.ArrayList;

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}