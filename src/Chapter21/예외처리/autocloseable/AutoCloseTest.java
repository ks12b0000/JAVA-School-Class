package Chapter21.예외처리.autocloseable;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		AutoCloseObject obj = new AutoCloseObject();
		
		try(AutoCloseObject obj2 = obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
