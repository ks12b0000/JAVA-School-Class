package Chapter10.컬렉션프레임워크1.arraylist2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> bookstore = new ArrayList<>();
		
		bookstore.add(new Book("도커", "애슐리"));
		bookstore.add(new Book("헬스케어","솔루션스"));
		bookstore.add(new Book("헬스케어2", "솔루션스2"));
		bookstore.add(new Book("헬스케어3", "솔루션스3"));
		bookstore.add(new Book("헬스케어4", "솔루션스4"));
	
		for(int i = 0; i < bookstore.size(); i++) {
			bookstore.get(i).showInfo();
		}
	
	}

}
