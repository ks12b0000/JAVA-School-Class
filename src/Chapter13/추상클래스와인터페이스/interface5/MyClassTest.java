package Chapter13.추상클래스와인터페이스.interface5;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass myClass = mClass;
		myClass.x();
		myClass.y();
		myClass.myMethod();

	}

}
