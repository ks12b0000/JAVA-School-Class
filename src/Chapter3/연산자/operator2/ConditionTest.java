package Chapter3.연산자.operator2;

import java.util.Scanner;

/*
 * 입력 받은 두 수중에서 큰 수를 출력하시오.
 * 입력1:23
 * 입력2:56
 * 56
 */

public class ConditionTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("입력 받은 두 수중에서 큰 수를 출력하시오.");
		System.out.print("더 큰 수 구하기 숫자입력1 : ");
		int num = scan.nextInt();	    
		System.out.print("더 큰 수 구하기 숫자입력2 : ");
	    int num1 = scan.nextInt();	    
	    int big = (num > num1) ? num : num1 ;
	    System.out.println("더 큰 수 : " +big);
	    
	    System.out.print("두 수의 차 구하기 숫자입력1 : ");
	    int num2 = scan.nextInt();
	    System.out.print("두 수의 차 구하기 숫자입력2 : ");
	    int num3 = scan.nextInt();
	    int diff = (num2 > num3) ? (num2 - num3) : (num3 - num2);
	    System.out.println("두 수의 차 : " + diff);
	    
	    System.out.print("더 작은 수 구하기 숫자입력1 : ");
	    int num4 = scan.nextInt();
	    System.out.print("더 작은 수 구하기 숫자입력2 : ");
	    int num5 = scan.nextInt();
	    int small = (num4 < num5)? num4 : num5;
	    System.out.println("더 작은 수 : " + small);
	    
	    
	    scan.close();
	    
	    
	    
		

	}

}
