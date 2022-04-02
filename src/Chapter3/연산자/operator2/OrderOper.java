package Chapter3.연산자.operator2;

public class OrderOper {

	public static void main(String[] args) {
		System.out.println();         // Println ()을 이용한 줄바꿈
		System.out.print("\n");       // 줄바꿈을 뜻하고 특수 문자 (아스키 코드)
		System.out.println("------------");
		
		int num = 5;                   //num에 이미 이진수를 할당
		System.out.print(num + '\n');    // 이진수 + 이진수 => 줄바꿈 되지 않음
		System.out.println("------------");
		System.out.print(num + "\n");      //줄바꿈
		
		System.out.println ("3 >= 2 "+ (3 >= 2) );
		//System.out.println ("3 >= 2 " + 3 >= 2 );
	}

}
