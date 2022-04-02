package Chapter2.변수.Variable;

/* 
 *   리터럴(literal)
 *     - 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함.
 *     - 정수 리터럴은 int로 저장 
 *        - int 범위를 벗어나는 long인 경우 접미사 L,l 써줘야함
 *     - 실수 리터럴은 double로 저장
 *        - float로 사용하려는 경우는 접미사(식별자) F,f를 써줘야 함.
 *        
 */

public class VarTest02 {

	public static void main(String[] args) {
		long result = 10L;
		float result2 = 10.1F;
		double dou = 9.9999;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(dou);
		
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result4 = num1 + num2;
		System.out.println(result4);  //부동 소수점 값을 연산하면 약간의 오차 발생
		                              //애초에 근사치 값이기 때문에.

	}

}
