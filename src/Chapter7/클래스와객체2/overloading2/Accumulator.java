package Chapter7.클래스와객체2.overloading2;

class A {
	int data1 = 10;
	int data2 = 20;
}

public class Accumulator {

	public int add(int x, int y) {
		System.out.println("add(int x, int y)");
		return x + y;
	}
	
//	public int add(int a, int b) {
//		
//	}
	public long add(int x, long y) {
		System.out.println("add(int x, long y)");
		return x + y;
	}
	
	public long add(long x, int y) {
		System.out.println("add(long x, int y)");
		return x + y;
	}
	
	public double add(double x, double y) {
		System.out.println("add(double x, double y)");
		return x + y;
	}
	public int add(A a) {
		System.out.println("add(A a)");
		return a.data1 +a.data2;
		
	}
	public long add(long x, long y) {
		System.out.println("add(long x, long y");
		return x * y;
	}
	public String add(String x, String y) {
		System.out.println("add(String x, String y)");
		return x + y;
	}
	public String add(String x, int y, String j) {
		System.out.println("add(String x, int y, String j)");
		return x + y + j;
	}
}
