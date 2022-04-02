package Chapter5.반복문.loop;

import java.util.Scanner;

/*
 * 구구단을 출력합니다.
 * 몇단부터 출력할까요> :
 * 끝단은 얼마인가요? :
 */

public class InputGugudan {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("구구단을 출력합니다.");
		System.out.println("몇단부터 출력할까요? :");
        int A = scan.nextInt();
        System.out.println("끝단은 얼마인가요? :");
        int B = scan.nextInt();
        for(int i = A; i <= B; i++) {
        	System.out.println("======"+i+"단=======");
        	for(int j = 1; j <= 9; j++) {
        		System.out.println(i +"*"+j+"="+(i*j) );
        	}	
        }
        
		scan.close();
	}

}
