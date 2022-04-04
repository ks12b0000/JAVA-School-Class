package Chapter13.추상클래스와인터페이스.abstract1;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOn();
		
		NoteBook noteBook = new MyNoteBook();

	}

}
