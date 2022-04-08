package Chapter15.기본클래스.etc;

interface Unit{
	@Deprecated
	void move(String str);
	void run(String str);
}

class Horse implements Unit{
	@Override
	public void move(String str) {
		System.out.println(str);
	}
	
		@Override
		public void run(String str) {
			System.out.println(str);
		
	}
}

public class DeprecatedTest {

	public static void main(String[] args) {
		
		Unit unit = new Horse();
		unit.move("이동합니다");
		unit.run("달립니다.");

	}

}
