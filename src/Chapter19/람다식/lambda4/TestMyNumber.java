package Chapter19.람다식.lambda4;

public class TestMyNumber {
	public static void main(String[] args) {
		
		MyMaxNumber max = (x,y) -> (x >= y)?x : y;
		System.out.println(max.getMaxNumber(10, 20));
	}

}
