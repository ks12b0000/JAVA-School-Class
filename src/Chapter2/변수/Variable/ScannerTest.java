package Chapter2.변수.Variable;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/*
		 * Scanner 클래스 : 입력을 받기 위한 클래스.
		 * 자원(Resource)은 사용하고나서 반드시 닫아줘야 함.
		 * 
		 */               
		 Scanner scan = new Scanner(System.in);
//		 System.out.print("정수 한자리 입력 :");
//		 int num = scan.nextInt();
//		 System.out.print("사용자로부터 입력받은 숫자 :" +num);
//		 
//		 
//		 System.out.print("실수 한자리 입력 :");
//		 double num1 = scan.nextDouble();
//		 System.out.print("사용자로부터 입력받은 숫자 :" + num1);
//		 
//		 
//		 System.out.println("곱하기 계산");
//		 System.out.print("곱해줄 첫번째 숫자를 넣으시오 : ");
//		 int A  = scan.nextInt();
//		 System.out.print("곱해줄 두번째 숫자를 넣으시오 : ");
//		 int b = scan.nextInt();
//		 System.out.println("곱해서 나온 값 : " + A * b );
		 
		 
		 /*
		  * next() : 공백을 기준으로해서 문자열 입력 => 단어를 입력시 사용
		  * nextLine : 엔터키를 입력할 때까지 문자열 입력 => 문장을 입력시 사용
		  */
		 
		 System.out.print("문자열 입력 :");
		 String str = scan.nextLine();
		 System.out.println("사용자로부터 입력받은 문자열 :" +str);
		
		 System.out.print("문자열 입력(숫자) :");
		 int result = 100;
		 String num =scan.nextLine();
		 /*
		  * Integer.parseInt() : 문자열로 입력받은 숫자들을 문자열이 아니라 
		  *                      숫자로 바꿔주는 역할을 하는 메서드다.
		  */
		
		 int temp = Integer.parseInt(num);
		 int total = result + temp;
		 System.out.println("연산결과 : " + total);
		 
		 
		 
		 scan.close();

	}

}
