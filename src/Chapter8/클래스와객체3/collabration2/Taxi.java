package Chapter8.클래스와객체3.collabration2;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
		
		
	}
	public void take(int money) {
		this.money += money;
	}
	public void taxiInfo() {
		System.out.println(taxiName+"의 수입은"+money+"원 입니다.");
		
	}
	
}
