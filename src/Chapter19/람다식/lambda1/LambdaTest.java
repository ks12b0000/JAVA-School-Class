package Chapter19.람다식.lambda1;

/*
 *  람다식 문법
 *  
 *    선언부                구현부
 *  -----------    -----------------
 *  (타입 매개변수) -> {실행문; 실행문; ...}
 *  
 */
public class LambdaTest {

	public static void main(String[] args) {
		
		MyInterface myInterface = () -> {
			String str = "람다식으로 만든 익명구현객체이다.";
			System.out.println(str);
		};
		
		myInterface.method();
		
		MyInterface myInterface2 = new MyInterface() {
			
			@Override
			public void method() {
				String str = "직접 만든 익명구현객체이다.";
				System.out.println(str);
				
			}
		};
		myInterface2.method();
		
		myInterface = () ->{
			System.out.println("람다식으로 만든 익명구현객체2이다.");
		};
		myInterface.method();
		
		myInterface = () -> System.out.println("람다식으로 만든 익명구현객체3이다.");
		myInterface.method();
	}
}
