package Chapter3.연산자.console;

import java.util.Scanner;

public class Printf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * 여러 숫자가 입력되면 => 버퍼에 일단 내용을 넣고 공백(스페이스)이나 탭으로 구분 
		 * 하나씩 입력된 데이터를 변수에 대입하게 된다.
		 */
		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하시오.");
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    
	    System.out.println("숫자를 4 입력하고 엔터를 입력하세요.");
	    int num4 = scan.nextInt();
	    System.out.println("숫자를 5 입력하고 엔터를 입력하세요.");
	    int num5 = scan.nextInt();
	    System.out.println("숫자를 6 입력하고 엔터를 입력하세요.");
	    int num6 = scan.nextInt();
	    
	    System.out.printf("%d %d %d %d %d %d",num1,num2,num3,num4,num5,num6);
		
		scan.close();

	}

}
