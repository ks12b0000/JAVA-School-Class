package Chapter23.스레드.thread;

public class CurrentThread {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : "+name);
	}

}
