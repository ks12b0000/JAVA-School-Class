package Chapter4.조건문.decision;

import java.util.Scanner;

/*
 * ID:
 * PW:
 * 
 * id가 ADMIN_ID
 * PW가 ADMIN_PASSWORD
 * <출력>
 * 관리자 로그인 성공
 *  로그인 실패
 *  
 */

public class IfElse {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0814";
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("ID: ");
		String id = scan.nextLine();
		System.out.print("PASSWORD :");
		String pw = scan.nextLine();
		
		
		
			if(id.equals(ADMIN_ID)&& pw.equals(ADMIN_PASSWORD)) {
				System.out.println("관리자 로그인 성공");
				
			}else {
				System.out.println("로그인 실패");
			}
			
				
				scan.close();
	
	}

}
