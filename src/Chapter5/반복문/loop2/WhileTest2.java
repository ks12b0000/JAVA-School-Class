package Chapter5.반복문.loop2;

import java.util.Scanner;

/*
 * =======================
 * 1.증속    2. 감속   3.중지
 * =======================
 * 입력 : 1
 * 현재 속도 : 1
 * 
 * 
 * =======================
 * 1.증속    2. 감속   3.중지
 * =======================
 * 입력 : 1
 * 현재 속도 : 2
 * 
 * =======================
 * 1.증속    2. 감속   3.중지
 * =======================
 * 입력 : 3
 * 프로그램을 종료합니다.
 * 
 * =======================
 * 1.증속    2. 감속   3.중지
 * =======================
 * 입력 : 4
 * 잘못된 입력 값입니다.
 * 
 * =======================
 * 1.증속    2. 감속   3.중지
 * =======================
 * 입력 : 2
 * 현재 속도 :-1 
 */

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    	
		boolean run = true;     //flag 변수
		int speed = 0;
		
		while(run) {
			System.out.println();
			System.out.println("========================");
			System.out.println("1.증속  | 2.감속  | 3.중지 ");
			System.out.println("========================");
			System.out.print("입력 : ");
		
            int chioce = scan.nextInt();
            if(chioce == 1) {
            	speed++;
            	System.out.println("현재 속도 : "+speed);
            }else if(chioce == 2) {
            	speed--;
            	System.out.println("현재 속도 : "+speed);
            }else if(chioce == 3){
            	//break;
            	run=false;
            	
            }else {
            	System.out.println("잘못된 입력 값입니다.");
            }
		
		}System.out.println("프로그램을 종료합니다.");
		
		
	   
	
	    	scan.close();
	}
}


