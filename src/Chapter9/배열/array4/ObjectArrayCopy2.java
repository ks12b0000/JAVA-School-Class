package Chapter9.배열.array4;

public class ObjectArrayCopy2 {

	

	public static void main(String[] args) {
		Book[] book = new Book[5];
		Book[] copybook = new Book[5];
		
		book[0] = new Book("Go 프로그래밍 쿡북", "에런 토레스");
		book[1] = new Book("Go 프로그래밍 쿡북1", "에런 토레스1");
		book[2] = new Book("Go 프로그래밍 쿡북2", "에런 토레스2");
		book[3] = new Book("Go 프로그래밍 쿡북3", "에런 토레스3");
		book[4] = new Book("Go 프로그래밍 쿡북4", "에런 토레스4");
		
		copybook[0] = new Book();
		copybook[1] = new Book();
		copybook[2] = new Book();
		copybook[3] = new Book();
		copybook[4] = new Book();
		
		for(int i = 0; i < book.length; i++) {
			copybook[i].setTitle(book[i].getTitle());
			copybook[i].setAuthor(book[i].getAuthor());
		}
		
		book[0].setTitle("데이터 플랫폼 설계와 구축");
		book[0].setAuthor("다닐 즈부리브스키");
		
		
		
		
		System.out.println("=======book========");
		for(Book book1 : book) {
			book1.showInfo();
		}
		
		
		System.out.println("=======copybook========");
		for(Book copyBook1 : copybook) {
			copyBook1.showInfo();

	}

}
}