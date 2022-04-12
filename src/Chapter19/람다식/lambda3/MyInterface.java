package Chapter19.람다식.lambda3;

@FunctionalInterface
public interface MyInterface {
	int method(int x, int y);
	//void method1();    //추상메서드가 2개 이상이면 컴파일 예외 발생시킴.
}
