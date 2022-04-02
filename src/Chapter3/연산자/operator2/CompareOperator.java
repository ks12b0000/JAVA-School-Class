package Chapter3.연산자.operator2;

public class CompareOperator {

	public static void main(String[] args) {
		System.out.println(" 2 >= 1 :" + (2 >= 1));
		System.out.println(" 2 <= 1 :" + (2 <= 1));
		
		//비교연산시에도 형변환이 일어난다.
		System.out.println("1.0 == 1 :" + (1.0 == 1));  //실수형으로 자동 형변환이 이루어짐
		System.out.println("1.0 != 1 :" + (1.0 != 1));  
		
		


	}

}
