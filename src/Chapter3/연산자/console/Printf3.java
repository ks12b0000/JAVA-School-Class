package Chapter3.연산자.console;

import java.util.Scanner;

public class Printf3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("문자열을 입력하고 엔터를 치세요.");
		String name = scan.nextLine();     //줄단위 입력 처리
		
		System.out.println("문자열을 입력하고 엔터를 치세요.");
		String name2 = scan.next();       // 공백이나 탭 단위로 처리
        String name3 = scan.next();
        String name4 = scan.next();
        
        System.out.printf("[%s] [%s] [%s] [%s]",name,name2,name3,name4);
	
		
		
		scan.close();

	}

}
