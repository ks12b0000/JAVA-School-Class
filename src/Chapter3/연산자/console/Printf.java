package Chapter3.연산자.console;

public class Printf {

	public static void main(String[] args) {
		String name = "Admiral Yi";
		int age = 20;
		double height = 189.5;
		
		System.out.printf("%s의 나이는 %d이고, 키는 %f입니다.\n",name,age,height);
		System.out.printf("%s의 나이는 %d이고, 키는 %.2f입니다.",name,age,height);
		
	}

}
