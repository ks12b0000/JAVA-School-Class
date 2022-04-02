package Chapter9.배열.array4;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] bookStore = new Book[5];
		
		bookStore[0] = new Book("Go 프로그래밍 쿡북", "에런 토레스");
		bookStore[1] = new Book("Go 프로그래밍 쿡북1", "에런 토레스1");
		bookStore[2] = new Book("Go 프로그래밍 쿡북2", "에런 토레스2");
		bookStore[3] = new Book("Go 프로그래밍 쿡북3", "에런 토레스3");
		bookStore[4] = new Book("Go 프로그래밍 쿡북4", "에런 토레스4");
		
		for(int i = 0; i < bookStore.length; i++) {
			//System.out.println(bookStore[i]);
			bookStore[i].showInfo();
		}
			
	}

}
