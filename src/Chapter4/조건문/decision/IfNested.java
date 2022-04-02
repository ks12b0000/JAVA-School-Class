package Chapter4.조건문.decision;

import java.util.Scanner;

/*
 * 성별 (1은 남자 2는 여자)
 * 나이,신체등급 순으로 입력 받아서 
 * ==> 신체등급 1~3 : 현역
 * ==> 신체등급 4 : 공익
 * 그 외 : 면제가 출력되는 프로그램을 작성하시오.
 * 
 * 여자 일때에는 추가적인 정보 입력 대신 "여성에게는 국방의무가 없습니다"가 출력되게 작성하시오
 * 남자이지만 미성년자일 경우 추가적인 정비 입력 대신 "미성년자에게는 아직 신체등급이 부여되지 않습니다."
 * 
 */
public class IfNested {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
       System.out.println("성별을 입력하세요.");
       int A = scan.nextInt();
       if(A==1) {
    	   System.out.println("나이를 입력하세요");
    	   int B = scan.nextInt();
    	   if(B > 19){
    		   System.out.println("신체 등급을 입력하세요");
    		   int C = scan.nextInt();
    		   if(C < 4) {
    			   System.out.println("현역입니다.");
    			   
    		   }else if(C == 4 ) {
				   System.out.println("공익입니다.");
				   }else {
	    			   System.out.println("면제입니다.");
	    		   }
 			  
    	   }else {
    		   System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다");
    	   }
       }else {
    	   System.out.println("여성에게는 국방의무가 없습니다");
       }
       
    		   
    	   
    	   
scan.close();

       }
	}


