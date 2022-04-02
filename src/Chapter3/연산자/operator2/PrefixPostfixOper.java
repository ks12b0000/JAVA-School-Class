package Chapter3.연산자.operator2;

public class PrefixPostfixOper {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(++num);    //num값 하나 증가 하고 출력을 함.
		System.out.println(num);      //num값이  증가되어 있음

		System.out.println(num++);    // 출력 먼저 하고 값이 증가.
		System.out.println(num);      // 위행에서 증가 된 값을 확인.
		
		
	}

}
