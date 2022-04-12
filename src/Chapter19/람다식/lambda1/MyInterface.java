package Chapter19.람다식.lambda1;

@FunctionalInterface
public interface MyInterface {
	void method();
	//void method1();    //추상메서드가 2개 이상이면 컴파일 예외 발생시킴.
}
