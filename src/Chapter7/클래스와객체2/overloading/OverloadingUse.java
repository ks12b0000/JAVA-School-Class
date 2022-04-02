package Chapter7.클래스와객체2.overloading;

class Calc {
	public int add(int a,int b) {
		return a + b;
	}
	public int add(int a) {
		return a;
	}
	public double add(double a, double b) {
		return a + b;
	}
	
}



public class OverloadingUse {

	public static void main(String[] args) {
		Calc calc = new Calc();
		int result1 = calc.add(3, 8);
        int result2 = calc.add(3);
	    double result3 = calc.add(3.0, 7.0);
	 System.out.println("result1 ="+result1);
	 System.out.println("result2 ="+result2);
	 System.out.println("result3 ="+result3);
	}
	
	
}
