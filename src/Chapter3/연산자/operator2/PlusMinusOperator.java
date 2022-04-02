package Chapter3.연산자.operator2;

public class PlusMinusOperator {

	public static void main(String[] args) {
		short num1 = 5;
		System.out.println(+num1);          //결과적으로 불필요한 + 연산임.
		System.out.println(-num1);          //부호를 바꿔서 얻은 결과를 출력
        System.out.println(num1);           //num1 값은 변하지 않음.
        
        short num2 = 7;
        // +부호 연산자에 의해 연산이 이루어짐, 이루어지려면 형변환이 일어나야 함.
        short num3 = (short) +num2;         // 형변환하지 않으면 오류 발생함.
        short num4 = (short) -num2;
	}

}
