package Chapter15.기본클래스.etc;

interface Unit2{
	@Deprecated
	void move(String str);
	void run(String str);
}

class Horse2 implements Unit2{
	@Override
	@SuppressWarnings("deprecation")
	public void move(String str) {
		System.out.println(str);
	}
	
		@Override
		public void run(String str) {
			System.out.println(str);
		
	}
}

public class SuppressWamingsTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Unit2 unit = new Horse2();
		unit.move("이동합니다");
		unit.run("달립니다.");

	}

}
