package Chapter8.클래스와객체3.staticmethod;

public class UtilityMethod {

	public static void main(String[] args) {
		MyCalculator calculator1 = new MyCalculator();
		int num1 = calculator1.adder(12, 1);
		System.out.println(num1);
		
		//객체를 생성하지 않고 사용
		int num2 = MyCalculator.adder(2, 3);        //클래스이름.메서드명
		System.out.println(num2);

	}

}
