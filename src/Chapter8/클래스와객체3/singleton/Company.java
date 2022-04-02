package Chapter8.클래스와객체3.singleton;

public class Company {

	private Company() {}
	private static Company instance = new Company();
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
