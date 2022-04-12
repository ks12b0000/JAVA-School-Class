package Chapter19.람다식.lambda2;

@FunctionalInterface
public interface MyInterface {
	void method(int x);
	//void method1();    //추상메서드가 2개 이상이면 컴파일 예외 발생시킴.
}
